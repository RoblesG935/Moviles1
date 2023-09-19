package com.chava.pdm1232

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstPartialView(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = stringResource(id = R.string.first_partial),
            color = MaterialTheme.colors.secondary
        )
        Button(
            onClick = { navController.navigate(route = "padelscore") },
            modifier = Modifier
                .fillMaxWidth() // Fill the available width
                .padding(16.dp) // Add padding
        ) {
            Text(text = stringResource(id = R.string.padel_score))

        }
        Button(
            onClick = { navController.navigate(route = "evenorodd") },
            modifier = Modifier
                .fillMaxWidth() // Fill the available width
                .padding(16.dp) // Add padding
        ) {
            Text(text = stringResource(id = R.string.even_or_odd))


        }
        Button(
            onClick = { navController.navigate(route = "cards") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        )
        {
            Text(text = stringResource(id = R.string.cards))


        }
        Button(
            onClick = { navController.navigate(route = "minor") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        )
        {
            Text(text = stringResource(id = R.string.minor))


        }
        Button(
            onClick = { navController.navigate(route = "barber") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        )
        {
            Text(text = stringResource(id = R.string.barber))

        }
        Button(
            onClick = { navController.navigate(route = "apple") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)

        )
        {
            Text(text = stringResource(id = R.string.apple))
        }
    }
}
