package com.example.videoblogmobileclient.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videoblogmobileclient.adapter.NewsFeedAdapter
import com.example.videoblogmobileclient.data.models.VideotapeContent
import com.example.videoblogmobileclient.data.models.user.GetUserModel
import com.example.videoblogmobileclient.databinding.FragmentNewsFeedBinding

class NewsFeedFragment : Fragment() {
    private lateinit var binding: FragmentNewsFeedBinding
    private lateinit var newsFeedAdapter: NewsFeedAdapter

    private val mockContent = mutableListOf<VideotapeContent>(
        VideotapeContent(
            0,
            GetUserModel(
                0,
                "John",
                "icon_url_1"
            ),
            "Simple text to test recycler view",
            "content uri",
            1240124,
            14,
            3
        ),
        VideotapeContent(
            0,
            GetUserModel(
                0,
                "Davie504",
                "icon_url_1"
            ),
            "Simple text to test recycler view",
            "content uri",
            1240124,
            14,
            3
        ),
        VideotapeContent(
            0,
            GetUserModel(
                0,
                "CodeMonkey",
                "icon_url_1"
            ),
            "Simple text to test recycler view",
            "content uri",
            1240124,
            14,
            3
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