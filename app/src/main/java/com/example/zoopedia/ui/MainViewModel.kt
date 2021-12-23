package com.example.zoopedia.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.zoopedia.data.AnimalModel
import com.example.zoopedia.data.AnimalsData

class MainViewModel : ViewModel() {

    private val data = MutableLiveData<ArrayList<AnimalModel>>()

    fun getAnimals(): LiveData<ArrayList<AnimalModel>> {
        data.value = AnimalsData.getAnimalsData()
        return data
    }
}