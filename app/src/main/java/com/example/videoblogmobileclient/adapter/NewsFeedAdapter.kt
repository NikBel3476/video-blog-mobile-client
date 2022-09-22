package com.example.videoblogmobileclient.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.videoblogmobileclient.data.models.VideotapeContent
import com.example.videoblogmobileclient.databinding.VideoContentItemBinding

class NewsFeedAdapter: RecyclerView.Adapter<NewsFeedAdapter.NewsFeedHolder>() {

    private var news = mutableListOf<VideotapeContent>()

    class NewsFeedHolder(item: View): RecyclerView.ViewHolder(item) {
        private val binding = VideoContentItemBinding.bind(item)

        fun bind(content: VideotapeContent) {
            binding.tvTextContent.text = content.text_content
            binding.authorName.text = content.author.login

            // TODO: Add Glide to set author icon

            // TODO: Add media player to show video
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsFeedHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = VideoContentItemBinding.inflate(inflater, parent, false)

        return NewsFeedHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NewsFeedHolder, position: Int) {
        val item = news[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return news.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun fillNewsList(list: MutableList<VideotapeContent>?) {
        if(!list.isNullOrEmpty())
            news = list
        else return
        notifyDataSetChanged()
    }
}