package com.chava.pdm1232.firstpartial

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import com.chava.pdm1232.R


@Composable
fun MinorView(navController: NavController, viewModel: MinorViewModel) {
    var numberOne by remember { mutableStateOf("") }
    var numberTwo by remember { mutableStateOf("") }
    var numberThree by remember { mutableStateOf("") }
    val numberMinor by viewModel.getNumber().observeAsState(0)
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = stringResource(id =R.string.question))
        TextField(
            value = numberOne,
            onValueChange = {
                numberOne = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            )
        TextField(
            value = numberTwo,
            onValueChange = {
                numberTwo = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),

            )
        TextField(
            value = numberThree, onValueChange = {
                numberThree = it
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )
        Button(onClick = {
            viewModel.getNumber(
                numberOne.toInt(),
                numberTwo.toInt(),
                numberThree.toInt()
            )
        }
        ) {
            Text(text = stringResource(id = R.string.consult))


        }
        Text(text = stringResource(id = R.string.theminor)+"${numberMinor}")



    }

}








