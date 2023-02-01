package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val items: List<String>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    class MyViewHolder(val textView: TextView):
    RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.my_text_view, parent, false)
        as TextView
        return MyViewHolder(textView)

    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        holder.textView.text = items[position]
    }
}
