package com.example.connectionretrofit.network

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    //Configurar retrofit , creamos el objeto retrofi
    private val URL_BASE = "https://api.chucknorris.io/jokes/random/"
        fun getRetrofitService(): ApiInterface {
            val retrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service: ApiInterface = retrofit.create(ApiInterface::class.java)
            return service
        }
}

class API {
    //donde recopolaremos los datos y haremos validacion pertinentes.
    private val service = RetrofitHelper.getRetrofitService() /*
    instanciar el servicio retrofit de nuestro objet anterior*/
    suspend fun getImagenAleatoria():List<String> {
        val icon_url: String
        val id: String
        val url: String
        val value: String

        val response = service.Chuck()
        /*obtenemos la respuesta y aplicamos la logica de que deseamos hacer con los campos*/

        icon_url = response.body()?.icon_url ?: ""
        id = response.body()?.id ?:""
        url = response.body()?.url ?:""
        value = response.body()?.value ?:""

        Log.d("API_PRUEBA", "url es " + response.body()?.url)
        Log.d("API_PRUEBA ", "imagw es " + response.body()?.icon_url)

        val strings = listOf<String>(icon_url,id,url,value)

        return strings
    }
}