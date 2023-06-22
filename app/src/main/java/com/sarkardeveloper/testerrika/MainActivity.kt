package com.sarkardeveloper.testerrika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sarkardeveloper.testerrika.databinding.ActivityMainBinding
import com.sarkardeveloper.testerrika.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as NewsApp).appComponent.inject(this)
        Singletons.init(applicationContext)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val model: MainViewModel by viewModels()

        model.loadNews()

        binding.recNews.setHasFixedSize(false)
        binding.recNews.layoutManager = LinearLayoutManager(this)

        model.newsSource.observe(this) {
            binding.recNews.adapter = NewsAdapter(it.articles, this)
        }

    }
}