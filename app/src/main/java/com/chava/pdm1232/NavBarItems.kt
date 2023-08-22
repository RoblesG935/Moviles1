package com.chava.pdm1232

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star


/**
 * Lista de las opciones del menu
 */
object NavBarItems {
    val NavBarItems= listOf(
        BarItem(
            title = "Primer Parcial",
            image = Icons.Filled.Home,
            route = "firstPartial"
        ),
        BarItem(
            title = "Segundo Parcial",
            image = Icons.Filled.Home,
            route = "secondPartial"
        ),
        BarItem(
            title = "Tercer Parcial",
            image = Icons.Filled.Star,
            route = "thirdPartial"

        )
    )
}