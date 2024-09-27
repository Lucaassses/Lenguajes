package com.example.lenguajes.nav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun DropdownMenuExample(
    lenguajes: List<String>,
    selectedLanguage: String,
    onSelect: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(selectedLanguage) }

    Column(modifier = Modifier.fillMaxWidth()) {
        OutlinedButton(
            onClick = { expanded = true },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = selectedText)
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            lenguajes.forEach { lenguaje ->
                DropdownMenuItem(
                    text = { Text(lenguaje) },
                    onClick = {
                        selectedText = lenguaje
                        expanded = false
                        onSelect(lenguaje)
                    }
                )
            }
        }
    }
}
@Composable
fun PantallaComun(
    navController: NavController,
    titulo: String,
    descripcion: String,
    imagenRes: Int
) {
    val lenguajes = listOf("Principal", "Java", "Python", "C++", "SQL", "Kotlin")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = titulo, fontSize = 32.sp, modifier = Modifier.padding(8.dp))

        Image(
            painter = painterResource(id = imagenRes),
            contentDescription = titulo,
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp)
        )

        Text(
            text = descripcion,
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp),
            color = Color.Gray
        )

        DropdownMenuExample(
            lenguajes = lenguajes,
            selectedLanguage = titulo,
            onSelect = { language ->
                val ruta = if (language == "Principal") "principal" else language.lowercase().replace("++", "plusplus")
                navController.navigate(ruta) {
                    popUpTo("principal") { inclusive = false }
                }
            }
        )
    }
}
