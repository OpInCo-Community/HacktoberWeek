package com.anurag.notekeepingapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(private val listener: OnTapHandler) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val dataSet = ArrayList<NoteEntity>()

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.note_view)
        val imageButton: ImageView = view.findViewById(R.id.delete_button)
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.note_item, viewGroup, false)

        val viewHolder = ViewHolder(view)
        viewHolder.imageButton.setOnClickListener {
            listener.onItemClick(dataSet[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.textView.text = dataSet[position].note
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

    fun updateNotes(notes: List<NoteEntity>) {
        dataSet.clear()
        dataSet += notes

        notifyDataSetChanged()
    }

}

interface OnTapHandler {
    fun onItemClick(note: NoteEntity)
}