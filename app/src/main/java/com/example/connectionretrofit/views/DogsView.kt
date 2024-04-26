package com.example.connectionretrofit.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import com.example.connectionretrofit.viewmodels.DogViewModel


@Composable
fun DogsView(dogViewModel: DogViewModel){

    var image = dogViewModel.urlImage

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text(text = "imagen url es ${image}")
        Button(
            onClick = {
                dogViewModel.fetchData()
                      },
            colors = ButtonDefaults.buttonColors(Color(0xFF94B885))) {
            Text(text = "imagen nueva")
        }
    }
}