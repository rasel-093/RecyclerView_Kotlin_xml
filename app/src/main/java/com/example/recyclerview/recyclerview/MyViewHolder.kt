package com.example.recyclerview.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.google.android.material.imageview.ShapeableImageView

class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    //itemView is from item_row layout.

    //getting id of title_image
    val titleImage: ShapeableImageView = itemView.findViewById(R.id.title_image)
    //getting id of headingTv
    val headingTv: TextView = itemView.findViewById(R.id.headingTv)
}