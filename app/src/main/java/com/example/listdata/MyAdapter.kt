package com.example.listdata

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList


class MyAdapter( val arrayList: ArrayList<Model>) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {

        var name:TextView
         var ll : RelativeLayout = itemView.findViewById(R.id.ll)
        var Id:TextView
        var Course:TextView
        var Time:TextView

        init {
            name = itemView.findViewById(R.id.nameview)
            Id = itemView.findViewById(R.id.Idview)
            Time = itemView.findViewById(R.id.TimeView3)
            Course = itemView.findViewById(R.id.courseView)
          //  relativeLayout = itemView.findViewById(R.id.relative)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.row,parent,false)
        return ViewHolder(listItem)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val model = arrayList[position]
        holder.name.text = arrayList[position].name
        holder.Id.text = arrayList[position].Id
        holder.Course.text = arrayList[position].course
        holder.Time.text = arrayList[position].Time
        holder.ll.setOnClickListener {

            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            intent.putExtra("name", model.name)
            intent.putExtra("ID", model.Id)
            intent.putExtra("course", model.course)
            intent.putExtra("Time", model.Time)
            holder.itemView.context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int {
        return arrayList.size
    }
}