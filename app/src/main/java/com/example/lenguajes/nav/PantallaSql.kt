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
fun PantallaSQL(navController: NavController) {
    PantallaComun(
        navController = navController,
        titulo = "SQL",
        descripcion = "SQL es un lenguaje de consulta estructurado que se utiliza para gestionar y manipular bases de datos relacionales.",
        imagenRes = R.drawable.sql
    )
}
