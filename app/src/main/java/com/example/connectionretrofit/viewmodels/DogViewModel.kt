package com.example.connectionretrofit.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.connectionretrofit.network.API
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DogViewModel: ViewModel () {
    var icon_url by mutableStateOf("")
    var id by mutableStateOf("")
    var url by mutableStateOf("")
    var value by mutableStateOf("")


    init {
        fetchData()
        }
    fun fetchData(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                icon_url = API().getImagenAleatoria().get(0)
                id = API().getImagenAleatoria().get(1)
                url = API().getImagenAleatoria().get(2)
                value = API().getImagenAleatoria().get(3)
            }
        }
    }
}
