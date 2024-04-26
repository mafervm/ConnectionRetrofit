package com.example.connectionretrofit.models

import com.google.gson.annotations.SerializedName

data class ImagenRandom(
    @SerializedName("message") val mensaje: String,
    var status: String
)
