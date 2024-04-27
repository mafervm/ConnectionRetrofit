package com.example.connectionretrofit.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.connectionretrofit.viewmodels.DogViewModel


@Composable
fun DogsView(dogViewModel: DogViewModel){

    var id = dogViewModel.id
    var icon_url = dogViewModel.icon_url
    var url = dogViewModel.url
    var value = dogViewModel.value


    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){

        AsyncImage(
            model = "${url}",
            contentDescription = null,
            modifier = Modifier
                .height(300.dp)
                .width(300.dp)
        )



        Text(text = url)
        Text(text = id)
        Text(text = value)
        Button(
            onClick = {
                dogViewModel.fetchData()
                      },
            colors = ButtonDefaults.buttonColors(Color(0xFF94B885))) {
            Text(text = "Update")
        }
    }
}