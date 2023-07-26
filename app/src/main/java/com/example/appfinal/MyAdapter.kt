package com.example.appfinal

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val context: Context, private val data: List<DataModel>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_cards, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)

        holder.itemView.setOnClickListener {
            when (position) {
                0 -> {
                    val intent = Intent(context, IecaActivity::class.java)
                    context.startActivity(intent)
                }
                1 -> {
                    val intent = Intent(context, TareaActivity::class.java)
                    context.startActivity(intent)
                }
                2 -> {
                    val intent = Intent(context, ExamenActivity::class.java)
                    context.startActivity(intent)
                }
                3 -> {
                    val intent = Intent(context, ReglasActivity::class.java)
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val cardTitle: TextView = itemView.findViewById(R.id.card_title)
        private val cardImage: ImageView = itemView.findViewById(R.id.card_image)

        fun bind(item: DataModel) {
            cardTitle.text = item.title
            cardImage.setImageResource(item.image)
        }
    }
}
