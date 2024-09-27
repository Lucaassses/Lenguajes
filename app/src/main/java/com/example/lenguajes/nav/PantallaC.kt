package com.example.lenguajes.nav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lenguajes.R

@Composable
fun PantallaCPlusPlus(navController: NavController) {
    PantallaComun(
        navController = navController,
        titulo = "C++",
        descripcion = "C++ es un lenguaje de programación de propósito general que ofrece programación orientada a objetos y capacidades de bajo nivel.",
        imagenRes = R.drawable.s
    )
}
