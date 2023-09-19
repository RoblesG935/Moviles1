package com.chava.pdm1232.firstpartial

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.*
import com.chava.pdm1232.R


@Composable
fun FirstParcialTestView(navController: NavController, viewModel: FirstParcialTestViewModel) {
    var productionTotal by remember { mutableStateOf("") }
    var productionActual by remember { mutableStateOf("") }
    var percent by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top

        ) {
            Image(
                painter = painterResource(id = R.drawable.manzanas),
                contentDescription = "Imagen de Manzanas"
            )

            Spacer(
                modifier = Modifier
                    .width(9.dp)
                    .height(200.dp)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top


        ) {
            Text(
                text = "Produccion Total",
                modifier = Modifier.padding(15.dp)
            )

            TextField(
                value = productionTotal,
                onValueChange = { productionTotal = it },
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                modifier = Modifier
                    .width(100.dp)
                    .height(49.dp)


            )


            Spacer(
                modifier = Modifier.width(10.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.manzanita),
                contentDescription = "Manzana",
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)

            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top

        ) {
            Text(
                text = "Produccion Actual",
                modifier = Modifier.padding(15.dp)
            )
            TextField(
                value = productionActual,
                onValueChange = { productionActual = it },
                modifier = Modifier
                    .width(100.dp)
                    .height(49.dp),

                )
            Spacer(
                modifier = Modifier.width(10.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.manzanita),
                contentDescription = "Manzana",
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp)

            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top

        ) {
            Button(
                onClick = { viewModel.add1() },
            ) {
                Text(text = "+5")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { viewModel.add2() }) {
                Text(text = "+15")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { viewModel.add3() }) {
                Text(text = "+30")
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = { viewModel.add4() }) {
                Text(text = "+50")
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top

        ) {
            Text(
                text = "Porcentaje",
                modifier = Modifier.padding(15.dp)
            )
            Text(text = "")
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentSize(Alignment.Center),
                horizontalArrangement = Arrangement.Center
            ) {


            }

        }
        Button(onClick = { }) {
            Text(text = "Calcular")
        }
    }
}












