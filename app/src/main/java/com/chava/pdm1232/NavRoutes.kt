package com.chava.pdm1232

/**
 * Clase para lista de rutas a las cuales se puede navegar dentro de la aplicacion
 */
sealed class NavRoutes (val route: String){
object firstPartial : NavRoutes("firstPartial")
object secondPartial : NavRoutes("secondPartial")
object thirdPartial : NavRoutes("thirdPartial")
}
