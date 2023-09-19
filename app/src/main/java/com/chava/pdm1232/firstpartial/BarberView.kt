package com.chava.pdm1232.firstpartial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.chava.pdm1232.R


@Composable
fun BarberView(navController: NavController, viewModel: BarberViewModel) {
    val cutResult by viewModel.getCutCount().observeAsState(0)
    val beardResult by viewModel.getBeardCount().observeAsState(0)
    val cnbResult by viewModel.getCutAndBeard().observeAsState(0)
    val totalResult by viewModel.getTotal().observeAsState(0)




    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,

    ) {
        Row (

            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
                ){
            Image(
                painter = painterResource(id = R.drawable.corte), contentDescription = "Imagen Corte",
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp))
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { viewModel.cut() }) {
                Text(text = stringResource(id = R.string.price))
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "${cutResult}")


            }
            Spacer(modifier = Modifier.width(10.dp))
        }
        Row(

            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.barba),
                contentDescription = "Imagen Barba",
                modifier = Modifier
                    .height(135.dp)
                    .width(135.dp)
            )
            Button(onClick = {viewModel.beard()}) {
                Text(text = stringResource(id = R.string.price2))
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "${beardResult}")

            }
            Spacer(modifier = Modifier.width(10.dp))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,

        ) {

            Image(
                painter = painterResource(id = R.drawable.corteybarba),
                contentDescription = "Imagen cyb",
                modifier = Modifier
                    .height(130.dp)
                    .width(130.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))

            Button(onClick = { viewModel.cnbeard() }) {
                Text(text = stringResource(id = R.string.price3))
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "${cnbResult}")




            }
            Spacer(modifier = Modifier.width(10.dp))


        }
        Button(onClick = {},
            modifier = Modifier
                .height(40.dp)
                .width(170.dp)



        ) {

            Text(text = "${totalResult}")



        }
    }
}

