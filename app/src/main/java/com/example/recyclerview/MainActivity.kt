package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.data.News
import com.example.recyclerview.data.NewsList
import com.example.recyclerview.recyclerview.MyAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var newsRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newsRecyclerView = findViewById<RecyclerView>( R.id.recyclerView)
        newsRecyclerView.layoutManager = LinearLayoutManager(this)
        newsRecyclerView.setHasFixedSize(true)
        newsRecyclerView.adapter = MyAdapter(newsList = NewsList.list)
    }
}