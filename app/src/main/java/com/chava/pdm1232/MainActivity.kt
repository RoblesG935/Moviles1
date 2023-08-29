package com.chava.pdm1232

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.chava.pdm1232.navigation.NavBarItems
import com.chava.pdm1232.navigation.NavRoutes
import com.chava.pdm1232.ui.theme.PDM1232Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PDM1232Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(
        topBar = { TopAppBar(title = { Text("ULSA CHIHUAHUA") }) },
        content = {
            it
            NavigationHost(navController = navController)
        },
        bottomBar = { BottomNavigationBar(navController = navController) }
    )
}

/**
 * Esta funcion sera encargada de manejar los tabs de la aplicacion
 */
@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavRoutes.firstPartial.route

    ) {
        composable(NavRoutes.firstPartial.route) {
            FirstPartialView(navController = navController)


        }
        composable(NavRoutes.secondPartial.route) {
            SecondPartialView()

        }
        composable(NavRoutes.thirdPartial.route) {
            ThirdPartialView()

        }
    }


}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    BottomNavigation {
        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route
        NavBarItems.NavBarItems.forEach { navItem ->
            BottomNavigationItem(
                selected = currentRoute == navItem.route,
                onClick = {
                    navController.navigate(navItem.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true

                        }
                        launchSingleTop = true
                        restoreState = true


                    }
                },
                icon = {
                    Icon(
                        imageVector = navItem.image,
                        contentDescription = navItem.title.toString()
                    )
                },
                label = {
                    Text(text = stringResource(id = navItem.title))


                },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PDM1232Theme {
        MainScreen()

    }
}