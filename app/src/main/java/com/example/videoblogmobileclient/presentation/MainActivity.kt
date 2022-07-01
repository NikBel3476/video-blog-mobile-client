package com.example.videoblogmobileclient.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.videoblogmobileclient.R
import com.example.videoblogmobileclient.databinding.ActivityMainBinding
import com.example.videoblogmobileclient.presentation.fragments.SignUpSingInFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}