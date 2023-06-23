package com.sarkardeveloper.testerrika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.sarkardeveloper.testerrika.databinding.ActivityMainBinding
import com.sarkardeveloper.testerrika.viewmodel.MainViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as NewsApp).appComponent.inject(this)
//        Singletons.init(applicationContext)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.loadNews()

        binding.recNews.setHasFixedSize(false)
        binding.recNews.layoutManager = LinearLayoutManager(this)

        viewModel.newsSource.observe(this) {
            binding.recNews.adapter = NewsAdapter(it.articles, this)
        }

    }
}