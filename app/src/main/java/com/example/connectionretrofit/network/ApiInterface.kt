package com.example.connectionretrofit.network

import com.example.connectionretrofit.models.Chuck
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("breeds/image/random") //Peticion get y definir url relativa
    suspend fun Chuck(): Response<Chuck> //nombre de funcion para la peticion y tipo de
}