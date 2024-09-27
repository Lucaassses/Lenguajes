package com.example.lenguajes.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationExample() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "principal") {
        composable("principal") {
            PantallaPrincipal(navController)
        }
        composable("java") { PantallaJava(navController) }
        composable("python") { PantallaPython(navController) }
        composable("cplusplus") { PantallaCPlusPlus(navController) }
        composable("sql") { PantallaSQL(navController) }
        composable("kotlin") { PantallaKotlin(navController) }
    }
    }

