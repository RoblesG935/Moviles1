package com.chava.pdm1232

import android.icu.text.CaseMap.Title
import android.media.Image
import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Esta es una clase de datos para los elementos del menu que aparece abajo
 */
data class BarItem(
    //Titulo de la opcion
val title: String,
// Icono de la opcion del menu
val image: ImageVector,
// Ruta a la cual se va a dirigir la opcion
val route: String

)
