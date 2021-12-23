package com.example.zoopedia.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class AnimalModel(
    val image: String? = null,
    val habitats: String? = null,
    val name: String? = null,
    val length: String? = null,
    val scientificName: String? = null,
    val status: String? = null,
    val desc: String? = null
) : Parcelable
