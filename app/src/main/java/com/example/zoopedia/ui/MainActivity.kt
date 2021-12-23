package com.example.zoopedia.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zoopedia.R
import com.example.zoopedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel= ViewModelProvider(this)[MainViewModel::class.java]
        binding.mainRv.layoutManager = LinearLayoutManager(this)
        viewModel.getAnimals().observe(this, Observer {

            adapter = ListAdapter(it)
            binding.mainRv.adapter = adapter
            adapter.notifyDataSetChanged()
        })


    }
}