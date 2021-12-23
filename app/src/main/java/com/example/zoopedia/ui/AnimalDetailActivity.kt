package com.example.zoopedia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zoopedia.databinding.ActivityAnimalDetailBinding

class AnimalDetailActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAnimalDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}