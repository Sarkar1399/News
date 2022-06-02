package com.sarkardeveloper.testerrika

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sarkardeveloper.testerrika.databinding.ItemNewsBinding
import com.sarkardeveloper.testerrika.model.News
import com.squareup.picasso.Picasso

class NewsAdapter(private val dataSet: List<News>, private val mContext: Context) :
    RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        val binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

    inner class ViewHolder(private val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: News) {
            binding.tvAuthor.visibility = if (item.author == null) View.GONE else View.VISIBLE
            binding.tvNewsTitle.visibility = if (item.title == null) View.GONE else View.VISIBLE
            binding.tvDescription.visibility =
                if (item.description == null) View.GONE else View.VISIBLE
            Picasso.get().load(item.urlToImage).placeholder(R.drawable.ic_loading_image)
                .error(R.drawable.ic_broked_image).into(binding.imgNews)
            binding.tvNewsTitle.text = item.title
            binding.tvAuthor.text = item.author
            binding.tvDescription.text = item.description
        }
    }
}