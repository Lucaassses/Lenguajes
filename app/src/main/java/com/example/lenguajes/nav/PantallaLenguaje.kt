/*package com.example.lenguajes.nav

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
//import com.example.lenguajesapp.R

@Composable
fun PantallaLenguaje(navController: NavController, titulo: String) {
    val lenguajes = listOf("Principal", "Java", "Python", "C++", "SQL", "Kotlin")
    var selectedLanguage by remember { mutableStateOf(titulo) }

    val descripcion = getDescripcion(titulo)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = titulo, fontSize = 24.sp, modifier = Modifier.padding(8.dp))

        /*Image(
            painter = painterResource(id = getImageResource(titulo)),
            contentDescription = titulo,
            modifier = Modifier
                .size(200.dp)
                .padding(16.dp)
        )*/

        Text(
            text = descripcion,
            fontSize = 16.sp,
            modifier = Modifier.padding(8.dp),
            color = Color.Gray
        )

        DropdownMenuExample(
            lenguajes = lenguajes,
            selectedLanguage = selectedLanguage,
            onSelect = { language ->
                selectedLanguage = language
                val ruta = if (language == "Principal") "principal" else "lenguaje/$language"
                navController.navigate(ruta) {
                    popUpTo("principal") { inclusive = false }
                }
            }
        )
    }
}

@Composable
fun DropdownMenuExample(
    lenguajes: List<String>,
    selectedLanguage: String,
    onSelect: (String) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Box {
        Button(onClick = { expanded = !expanded }) {
            Text(text = "Navegar a: $selectedLanguage")
        }
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            lenguajes.forEach { lenguaje ->
                DropdownMenuItem(
                    text = { Text(lenguaje) },
                    onClick = {
                        onSelect(lenguaje)
                        expanded = false
                    }
                )
            }
        }
    }
}

// Función que devuelve la descripción de cada lenguaje
fun getDescripcion(titulo: String): String {
    return when (titulo) {
        "Java" -> "Java es un lenguaje de programación orientado a objetos utilizado ampliamente en el desarrollo de aplicaciones web, móviles y de escritorio."
        "Python" -> "Python es un lenguaje de programación de alto nivel y fácil de aprender, utilizado en ciencia de datos, desarrollo web y scripting."
        "C++" -> "C++ es un lenguaje de programación de propósito general que ofrece programación orientada a objetos y capacidades de bajo nivel."
        "SQL" -> "SQL es un lenguaje de consulta estructurado que se utiliza para gestionar y manipular bases de datos relacionales."
        "Kotlin" -> "Kotlin es un lenguaje moderno y conciso que se utiliza para el desarrollo de aplicaciones Android y multiplataforma."
        else -> "No hay descripción disponible."
    }
}

// Función que devuelve el recurso de imagen según el lenguaje
/*fun getImageResource(titulo: String): Int {
    return when (titulo) {
        "Java" -> R.drawable.java
        "Python" -> R.drawable.python
        "C++" -> R.drawable.cplusplus
        "SQL" -> R.drawable.sql
        "Kotlin" -> R.drawable.kotlin
        else -> R.drawable.default_image
    }
*/