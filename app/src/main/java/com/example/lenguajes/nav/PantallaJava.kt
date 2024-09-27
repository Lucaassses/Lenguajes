package com.example.lenguajes.nav


import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.lenguajes.R

@Composable
fun PantallaJava(navController: NavController) {
    PantallaComun(
        navController = navController,
        titulo = "Java",
        descripcion = "Java es un lenguaje de programación orientado a objetos utilizado ampliamente en el desarrollo de aplicaciones web, móviles y de escritorio.",
        imagenRes = R.drawable.j
    )
}
