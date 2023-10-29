package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.data.News
import com.example.recyclerview.data.NewsList
import com.example.recyclerview.recyclerview.MyAdapter
import com.example.recyclerview.recyclerview.onItemClickListener

class MainActivity : AppCompatActivity() {

    private lateinit var newsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newsRecyclerView = findViewById<RecyclerView>( R.id.recyclerView)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
        newsRecyclerView.setHasFixedSize(true)

        var  adapter = MyAdapter(newsList = NewsList.list)
        newsRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(this@MainActivity,"Clicked on item $position",Toast.LENGTH_SHORT).show()
            }
        })
    }
}