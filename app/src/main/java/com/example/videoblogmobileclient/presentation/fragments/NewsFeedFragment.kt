package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.adapter.NewsFeedAdapter
import com.example.videoblogmobileclient.data.models.User
import com.example.videoblogmobileclient.data.models.VideotapeContent
import com.example.videoblogmobileclient.databinding.FragmentNewsFeedBinding
import java.util.*

class NewsFeedFragment : Fragment() {
    private lateinit var binding: FragmentNewsFeedBinding
    private lateinit var newsFeedAdapter: NewsFeedAdapter

    private val mockContent = mutableListOf<VideotapeContent>(
        VideotapeContent(
            0,
            "Simple text to test recycler view",
            Date(1240124),
            User(
                "John",
                "Email",
                "123",
                "123"
            ),
            R.drawable.kot,
            R.drawable.ic_launcher_background
        ),
        VideotapeContent(
            1,
            "Do you know this interested fact about sakura?!",
            Date(1240124),
            User(
                "David",
                "Email",
                "123",
                "123"
            ),
            R.drawable.sakura,
            R.drawable.ic_launcher_foreground
        ),
        VideotapeContent(
            2,
            "New champion coming soon!!!",
            Date(1240124),
            User(
                "David",
                "Email",
                "123",
                "123"
            ),
            R.drawable.sova,
            R.drawable.ic_launcher_foreground
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsFeedBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()

        newsFeedAdapter.fillNewsList(mockContent)
    }

    private fun initRecycler() {
        binding.rvVideoContent.apply {
            newsFeedAdapter = NewsFeedAdapter()
            adapter = newsFeedAdapter
        }
    }
}