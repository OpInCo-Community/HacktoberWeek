package com.anurag.notekeepingapp

import android.os.Bundle
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.anurag.notekeepingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnTapHandler {
    private lateinit var binding: ActivityMainBinding

    private val viewModel: NotesViewModel by viewModels {
        NotesViewModelFactory((application as NoteApplication).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = RecyclerViewAdapter(this)
        binding.myRecyclerView.adapter = adapter

        viewModel.allNotes.observe(this) { notes ->
            notes?.let {
                adapter.updateNotes(notes)
            }
        }

    }

  override fun alertDialog(position: NoteEntity){

     val dialog = AlertDialog.Builder(this)


     dialog.setTitle(getString(R.string.alert_dialog_title))
     dialog.setIcon(R.drawable.ic_round_error_outline_24)

     dialog.setMessage(getString(R.string.alert_dialog_message))
     dialog.setPositiveButton("Yes"){Interface, which ->
         viewModel.delete(position)
     }
     dialog.setNegativeButton("No"){Interface,  which ->
         Interface.dismiss()
     }

    val alertDialog : AlertDialog = dialog.create()
      alertDialog.setCancelable(false)
      alertDialog.show()
 }

    fun addNewNote(view: android.view.View) {
        val noteText = binding.addNoteView.text.toString()
        if (noteText.isNotEmpty()) {
            viewModel.insert(NoteEntity(note = noteText))
            binding.addNoteView.text.clear()
        }


    }

}