package com.example.zoopedia.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zoopedia.data.AnimalModel
import com.example.zoopedia.databinding.ItemLayoutBinding
import com.example.zoopedia.utils.loadUrl

class ListAdapter(val data : ArrayList<AnimalModel>) : RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: AnimalModel) {
            with(binding) {
                image.loadUrl(model.image!!)
                animalName.text = model.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size
}