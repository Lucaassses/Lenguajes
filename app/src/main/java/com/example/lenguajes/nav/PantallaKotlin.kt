package com.example.lenguajes.nav

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.lenguajes.R


@Composable
fun PantallaKotlin(navController: NavController) {
    PantallaComun(
        navController = navController,
        titulo = "Kotlin",
        descripcion = "Kotlin es un lenguaje moderno y conciso que se utiliza para el desarrollo de aplicaciones Android y multiplataforma.",
        imagenRes = R.drawable.k
    )

}
