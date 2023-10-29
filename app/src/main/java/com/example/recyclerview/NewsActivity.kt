package com.example.recyclerview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        val newsHeading = findViewById<TextView>(R.id.newsHeading)
        val newsImage = findViewById<ImageView>(R.id.newsImage)
        val newsArticle = findViewById<TextView>(R.id.newsArticle)
        newsArticle.setMovementMethod(ScrollingMovementMethod())

        val bundle: Bundle? = intent.extras
        val heading = bundle!!.getString("heading")
        val image = bundle.getInt("imageId")
        val article = bundle.getString("article")

        newsHeading.setText(heading)
        newsImage.setImageResource(image)
        newsArticle.setText(article)
    }
}