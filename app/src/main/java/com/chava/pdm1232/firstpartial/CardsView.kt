package com.chava.pdm1232.firstpartial

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.chava.pdm1232.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun CardsView(navController: NavController, viewModel: CardsViewModel) {


    val cardId by viewModel.getImagen().observeAsState(R.drawable.back)
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = cardId),
            contentDescription = "Imagen",
            modifier = Modifier
                .height(450.dp)
                .width(450.dp)
        )
        Row() {
            Button(
                onClick = { viewModel.hideCard() }
            ) {
                Text(text = stringResource(id = R.string.hide))


            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = { viewModel.getNumbers() }
            ) {
                Text(text = stringResource(id = R.string.random))

            }
        }


    }
}