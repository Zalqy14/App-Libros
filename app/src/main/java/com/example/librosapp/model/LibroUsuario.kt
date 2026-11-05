package com.example.librosapp.model

enum class EstadoLectura {
    QUIERO_LEER,
    LEYENDO,
    LEIDO
}

// Libros que vienen de la api de Google y no son elegidos aun por el usuario
data class LibroBusqueda(
    val volumeId: String,
    val titulo: String,
    val autor: String,
    val paginas: Int,
    val descripcion: String
)

// Libros elegidos por el usuario
data class LibroUsuario(
    // Datos del libro (vienen de Google Books)
    // EL volumeId viene con letras numero Entonces no puede ser ni int ni long de la API
    val volumeId: String,
    val titulo: String,
    val paginas: Int,
    val autor: String,


    // Estado personal
    val estado: EstadoLectura,

    // Solo "Quiero leer"
    val recomendadoPor: String? = null,
    val valoracionInteres: Int? = null,

    // "Leyendo" y "Leídos"
    val fechaInicio: Long? = null,

    // Solo "Leídos"
    val fechaFin: Long? = null,
    val valoracion: Int? = null,
    val porcentajeRecomendacion: Int? = null,
    val resena: String? = null
)