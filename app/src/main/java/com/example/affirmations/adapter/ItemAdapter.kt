package com.example.affirmations.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

//This class is used as an adapter to convert a string to an element usable by the RecyclerView
//Context is used to store data about the app
class ItemAdapter(private val context:Context, private val dataSet: List<Affirmation>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    //RecyclerView doesn't interact directly with item views, but deals with ViewHolders instead.
    //This inner class represents a single list item and implements the interface RecyclerView.ViewHolder
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }


    //These functions from RecyclerView.Adapter must be implemented (abstract in parent)
    //called by the layout manager to create new view holders
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //inflate the textview item into a usable item
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }
    //called by the layout manager to replace the contents of each list item view.
    //position parameter is used to initialise the nth element in the list
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item: Affirmation = dataSet[position]
        //fill the textView with the correct string from strings.xml
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //How many items in the list ?
    override fun getItemCount(): Int {
        return dataSet.size
    }

}