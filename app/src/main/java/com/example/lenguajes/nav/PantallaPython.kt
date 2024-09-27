package com.example.lenguajes.nav


import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.lenguajes.R

@Composable
fun PantallaPython(navController: NavController) {
    PantallaComun(
        navController = navController,
        titulo = "Python",
        descripcion = "Python es un lenguaje de programación de alto nivel y fácil de aprender, utilizado en ciencia de datos, desarrollo web y scripting.",
        imagenRes = R.drawable.python
    )
}
