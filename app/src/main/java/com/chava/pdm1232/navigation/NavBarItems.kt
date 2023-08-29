package com.chava.pdm1232.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import com.chava.pdm1232.R
import com.chava.pdm1232.navigation.BarItem


/**
 * Lista de las opciones del menu
 */
object NavBarItems {
    val NavBarItems= listOf(
        BarItem(
            title = R.string.first_partial,
            image = Icons.Filled.Home,
            route = "firstPartial"
        ),
        BarItem(
            title = R.string.second_partial,
            image = Icons.Filled.Face,
            route = "secondPartial"
        ),
        BarItem(
            title = R.string.third_partial,
            image = Icons.Filled.Star,
            route = "thirdPartial"

        )
    )
}