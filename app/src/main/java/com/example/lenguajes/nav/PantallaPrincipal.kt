package com.example.lenguajes.nav


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun PantallaPrincipal(navController: NavController) {
    val lenguajes = listOf("Java", "Python", "C++", "SQL", "Kotlin")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Lenguajes de Programación", fontSize = 24.sp, modifier = Modifier.padding(8.dp))

        LazyColumn {
            items(lenguajes) { lenguaje ->
                val route = lenguaje.lowercase().replace("++", "plusplus")
                Text(
                    text = lenguaje,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable { navController.navigate(route)}
                )
            }
        }
    }
}
