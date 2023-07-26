package com.example.appfinal

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.card.MaterialCardView

class SessionAdapter(private val context: Context, private var data: MutableList<SessionModel>) : RecyclerView.Adapter<SessionAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_sessions, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun clear() {
        data.clear()
        notifyDataSetChanged()
    }

    fun setData(coursesList: MutableList<SessionModel>) {
        (data as MutableList).addAll(coursesList)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val sessionTitle: TextView = itemView.findViewById(R.id.session_title)
        private val sessionStatus: TextView = itemView.findViewById(R.id.session_status)
        private val sessionCard: MaterialCardView = itemView.findViewById(R.id.item_sessions)

        fun bind(item: SessionModel) {
            sessionTitle.text = item.title
            sessionStatus.text = item.status.toString()

            if (item.status == true) {
                sessionStatus.setTextColor(context.resources.getColor(R.color.black))
                sessionCard.strokeColor = context.resources.getColor(R.color.black)
                sessionStatus.text = "Completada"
            } else {
                sessionStatus.setTextColor(context.resources.getColor(R.color.white))
                sessionCard.strokeColor = context.resources.getColor(R.color.white)
                sessionStatus.text = "Pendiente"
            }
        }
    }




}