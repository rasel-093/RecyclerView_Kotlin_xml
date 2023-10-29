package com.example.recyclerview.data

import android.content.res.Resources
import com.example.recyclerview.R

object NewsList{
    val list : ArrayList<News> = arrayListOf(
        News(newsImg.news1,newsTitle.news1),
        News(newsImg.news2,newsTitle.news2),
        News(newsImg.news3,newsTitle.news3),
        News(newsImg.news4,newsTitle.news4),
        News(newsImg.news5,newsTitle.news5)
    )
}
object newsImg{
    val news1 = R.drawable.img1
    val news2 = R.drawable.img2
    val news3 = R.drawable.img3
    val news4 = R.drawable.img4
    val news5 = R.drawable.img5

}
object newsTitle{
    val news1 = "AL’s \\'peace rally\\' begins at Baitul Mukarram south gate"
    val news2 = "Fighting in Gaza will be 'long and difficult': Netanyahu"
    val news3 = "Tigers stoop to their lowest"
    val news4 = "3 buses torched in a span of 12 minutes"
    val news5 = "Youths ‘wearing police vest’ set bus on fire at Kakrail"
}