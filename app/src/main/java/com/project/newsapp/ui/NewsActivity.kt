package com.project.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.newsapp.R
import com.project.newsapp.api.RetrofitInstance

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
    }
}