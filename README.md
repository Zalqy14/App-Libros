# 📚 LibrosApp

**LibrosApp** es una aplicación nativa para Android desarrollada en **Kotlin** para la gestión personal de lectura de libros, seguimiento de lecturas y perfil de usuario.

---

## 📋 Tabla de Contenidos
- [Descripción General](#-descripción-general)
- [Características y Pantallas](#-características-y-pantallas)
- [Arquitectura y Estructura del Proyecto](#-arquitectura-y-estructura-del-proyecto)
- [Tecnologías y Dependencias](#-tecnologías-y-dependencias)
- [Configuración del Sistema](#-configuración-del-sistema)
- [Compilación y Ejecución](#-compilación-y-ejecución)

---

## 📖 Descripción General

La aplicación está concebida para ayudar a los usuarios a organizar su biblioteca personal dividiendo sus libros según el estado de lectura:
- Libros que el usuario **quiere leer** (Lista de deseos / Wishlist).
- Libros que se están **leyendo** actualmente.
- Libros que ya han sido **leídos**.
- Funcionalidad de **búsqueda de libros**.
- Gestión del **perfil de usuario**.

---

## 📱 Características y Pantallas

El proyecto consta de las siguientes actividades (Activities) principales:

| Actividad | Archivo Kotlin | Layout XML | Descripción |
| :--- | :--- | :--- | :--- |
| **Menú Principal** | [`Menu.kt`](app/src/main/java/com/example/librosapp/Menu.kt) | `activity_main.xml` | Punto de entrada principal y lanzador (LAUNCHER) de la aplicación. |
| **Búsqueda de Libros** | [`BusquedaLibros.kt`](app/src/main/java/com/example/librosapp/BusquedaLibros.kt) | `activity_busqueda_libros.xml` | Pantalla para buscar libros en el catálogo o biblioteca. |
| **Quiero Leer** | [`QuieroLeer.kt`](app/src/main/java/com/example/librosapp/QuieroLeer.kt) | `activity_quiero_leer.xml` | Sección dedicada a los libros pendientes por leer. |
| **Leyendo** | [`Leyendo.kt`](app/src/main/java/com/example/librosapp/Leyendo.kt) | `activity_leyendo.xml` | Sección que muestra las lecturas en curso del usuario. |
| **Leídos** | [`Leidos.kt`](app/src/main/java/com/example/librosapp/Leidos.kt) | `activity_leidos.xml` | Registro e historial de libros ya terminados. |
| **Perfil de Usuario** | [`PerfilUsuario.kt`](app/src/main/java/com/example/librosapp/PerfilUsuario.kt) | `activity_perfil_usuario.xml` | Vista para gestionar la información personal del usuario. |

---

## 🏗️ Arquitectura y Estructura del Proyecto

```text
LibrosApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/librosapp/
│   │   │   │   ├── BusquedaLibros.kt   # Actividad de Búsqueda
│   │   │   │   ├── Leidos.kt           # Actividad de Libros Leídos
│   │   │   │   ├── Leyendo.kt          # Actividad de Lecturas Activas
│   │   │   │   ├── Menu.kt             # Actividad Principal / Menú
│   │   │   │   ├── PerfilUsuario.kt    # Actividad de Perfil
│   │   │   │   └── QuieroLeer.kt       # Actividad de Lista de Deseos
│   │   │   ├── res/
│   │   │   │   ├── layout/            # Layouts en XML (ConstraintLayout)
│   │   │   │   ├── values/            # Colores, cadenas y temas
│   │   │   │   └── mipmap/            # Iconos de la aplicación
│   │   │   └── AndroidManifest.xml    # Declaración de componentes e Intents
│   │   ├── test/                       # Pruebas unitarias locales (JUnit 4)
│   │   └── androidTest/                # Pruebas instrumentadas (Espresso / AndroidJUnitRunner)
│   └── build.gradle.kts                # Configuración de Gradle del módulo app
├── gradle/
│   └── libs.versions.toml              # Catálogo de versiones de dependencias (Version Catalog)
└── build.gradle.kts                    # Configuración de Gradle a nivel de proyecto
```

---

## 🛠️ Tecnologías y Dependencias

- **Lenguaje:** Kotlin
- **SDK Mínimo:** Android 7.0 (API 24 - `minSdk = 24`)
- **SDK Objetivo / Compilación:** API 37 (`targetSdk = 37`, `compileSdk = 37`)
- **Compatibilidad Java:** Java 11
- **Componentes de UI:**
  - `androidx.appcompat:appcompat`
  - `com.google.android.material:material`
  - `androidx.constraintlayout:constraintlayout`
  - `androidx.activity:activity-ktx` (Edge-to-Edge UI enabled)
- **Pruebas:**
  - `junit:junit`
  - `androidx.test.ext:junit`
  - `androidx.test.espresso:espresso-core`

---

## ⚙️ Configuración del Sistema (AndroidManifest.xml)

- La actividad **`Menu`** está configurada como actividad de inicio (`android.intent.action.MAIN` y `android.intent.category.LAUNCHER`) y exportada (`android:exported="true"`).
- Todas las demás actividades (`BusquedaLibros`, `QuieroLeer`, `Leyendo`, `Leidos`, `PerfilUsuario`) están declaradas con `android:exported="false"` y ajuste dinámico de teclado virtual (`android:windowSoftInputMode="adjustResize"`).
- Soporte para **Edge-to-Edge** en todas las pantallas ajustando insets de sistema (`WindowInsetsCompat.Type.systemBars()`).

---

## 🚀 Compilación y Ejecución

1. Abrir el proyecto en **Android Studio** (versión compatible con AGP 9.4+ / Gradle 8.x).
2. Sincronizar Gradle (*Sync Project with Gradle Files*).
3. Seleccionar un emulador Android o dispositivo físico conectado con API 24 o superior.
4. Ejecutar la app seleccionando el módulo `app` y pulsando **Run** (`Shift + F10`).
