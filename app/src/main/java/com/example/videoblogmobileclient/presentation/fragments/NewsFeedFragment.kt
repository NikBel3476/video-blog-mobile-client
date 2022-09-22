package com.example.videoblogmobileclient.presentation.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.databinding.FragmentNewsFeedBinding

class NewsFeedFragment : Fragment() {
    private lateinit var binding: FragmentNewsFeedBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNewsFeedBinding.inflate(inflater)
        return binding.root
    }
}