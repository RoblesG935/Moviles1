package com.chava.pdm1232.navigation

/**
 * Clase para lista de rutas a las cuales se puede navegar dentro de la aplicacion
 */
sealed class NavRoutes (val route: String){
object firstPartial : NavRoutes("firstPartial")
object secondPartial : NavRoutes("secondPartial")
object thirdPartial : NavRoutes("thirdPartial")
    object PadelScore: NavRoutes("padelScore")
    object ParoNon: NavRoutes("evenorodd")

}
