package com.example.recyclerview

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.data.News
import com.example.recyclerview.data.newsImg
import com.example.recyclerview.data.newsList
import com.example.recyclerview.data.newsTitle
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

        var  adapter = MyAdapter(newsList = newsList)
        newsRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : onItemClickListener{
            override fun onItemClick(position: Int) {
                //Toast.makeText(this@MainActivity,"Clicked on item $position",Toast.LENGTH_SHORT).show()
                val intent = Intent(this@MainActivity,NewsActivity::class.java)
                intent.putExtra("imageId",newsList[position].titleImage)
                intent.putExtra("heading",newsList[position].heading)
                intent.putExtra("article",newsList[position].article)
                startActivity(intent)
            }
        })
    }
}