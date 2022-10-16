package com.example.memeshare


import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var currentImageUrl : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed(
            object :Runnable {
                override fun run() {
                    splash.visibility=View.GONE
                    non_splash.visibility=View.VISIBLE
                }
            },2000
        )

        loadMeme()
        nextMeme()
        shareMeme()
    }


    private fun loadMeme(){
// Instantiate the RequestQueue.
        pbImage.visibility = View.VISIBLE
        val queue = Volley.newRequestQueue(this)
        val url = "https://meme-api.herokuapp.com/gimme"

// Request a string response from the provided URL.
        val jsonObjectRequest = JsonObjectRequest(
            Request.Method.GET, url,null,
            { response ->
                currentImageUrl = response.getString("url")
                Glide.with(this).load(currentImageUrl).listener(object : RequestListener<Drawable>{
                    override fun onLoadFailed(
                        e: GlideException?,
                        model: Any?,
                        target: Target<Drawable>?,
                        isFirstResource: Boolean
                    ): Boolean {
                        pbImage.visibility = View.GONE
                        return false
                    }

                    override fun onResourceReady(
                        resource: Drawable?,
                        model: Any?,
                        target: Target<Drawable>?,
                        dataSource: DataSource?,
                        isFirstResource: Boolean
                    ): Boolean {
                        pbImage.visibility = View.GONE
                        return false
                    }
                }).into(ivQuote)

            },
            { Toast.makeText(this, "Error..", Toast.LENGTH_SHORT).show()})

// Add the request to the RequestQueue.
        queue.add(jsonObjectRequest)

    }

    fun nextMeme(){
        btnNext.setOnClickListener{
            loadMeme()
        }
    }

    fun shareMeme(){
        btnShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "Hey what a funny meme it is!! $currentImageUrl")
            val chooser = Intent.createChooser(intent, "Share this using..")
            startActivity(intent)
        }
    }

}
