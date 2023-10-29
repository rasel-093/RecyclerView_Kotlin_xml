package com.example.recyclerview.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.data.News
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(
    private val newsList: ArrayList<News>
): RecyclerView.Adapter<MyViewHolder>() {

    private lateinit var mListener: onItemClickListener

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //itemView is of View type. Creating this view from item_row layout
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        //Returning MyviewHolder type object
        return MyViewHolder(itemView,  mListener)
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = newsList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.headingTv.text = currentItem.heading
    }
}