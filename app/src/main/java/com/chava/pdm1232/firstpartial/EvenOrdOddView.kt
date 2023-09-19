package com.chava.pdm1232.firstpartial

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.chava.pdm1232.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import com.chava.pdm1232.ui.theme.utils.ComposeLottieAnimation
import com.chava.pdm1232.ui.theme.utils.ComposeLottieAnimation2


@Composable
fun EvenOrOddView(navController: NavController, viewModel: EvenOrOddViewModel) {
    /**
     * Esta variable almacena el valor de la caja de texto
     */
    var txtNumber by remember { mutableStateOf("") }
    val evenOrOddStatus by viewModel.getResultStatus().observeAsState("")


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
     /**   if (viewModel.isEven.value == true) {
            ComposeLottieAnimation(modifier = Modifier
                .width(20.dp)
                .height(20.dp))

        } else {
            ComposeLottieAnimation2(modifier = Modifier
                .width(20.dp)
                .height(20.dp))

        }
*/


        Text(text = stringResource(id = R.string.even_or_odd))
        TextField(
            value = txtNumber, onValueChange = {
                txtNumber = it
                if (txtNumber != "") {
                    viewModel.calculateEvenOrOdd(txtNumber.toInt())


                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )
        Text(text = evenOrOddStatus)


    }
}
