# 🎬 ScreenMatch

Proyecto educativo de **Java** desarrollado como parte del curso de **Programación Orientada a Objetos (POO)** de [Alura Cursos](https://www.alura.com.br/) y [Oracle Next Education](https://www.oracle.com/education/).

ScreenMatch es una aplicación de consola que simula un catálogo de películas y series, demostrando los fundamentos de la POO en Java.

## 🚀 Funcionalidades

- **Modelado de dominio**: Clases `Pelicula`, `Serie`, `Episodio` con herencia desde `Titulo`
- **Sistema de clasificación**: Evaluación de títulos con clasificación por estrellas (0–5)
- **Filtro de recomendación**: Sugerencias basadas en la clasificación
- **Calculadora de tiempo**: Suma la duración total de una colección de títulos (polimorfismo)
- **Consumo de API**: Búsqueda de películas en la [OMDb API](http://www.omdbapi.com/) mediante `java.net.http`
- **Colecciones y ordenamiento**: `ArrayList`, `Collections.sort()`, `Comparator` y pattern matching con `instanceof`
- **Sobrescritura de métodos**: `toString()` personalizado en cada clase

## 📁 Estructura del proyecto

```
src/
└── com/aluracursos/screenmatch/
    ├── calculos/
    │   ├── CalculadoraDeTiempo.java
    │   ├── Clasificacion.java
    │   └── FiltroRecomendacion.java
    ├── modelos/
    │   ├── Episodio.java
    │   ├── Pelicula.java
    │   ├── Serie.java
    │   └── Titulo.java
    └── principal/
        ├── Principal.java
        ├── PrincipalConBusqueda.java
        └── PrincipalConListas.java
```

## 🛠️ Stack tecnológico

| Tecnología | Descripción |
|---|---|
| **Java 25** (JDK openjdk-25) | Lenguaje principal |
| **java.net.http** | Cliente HTTP para consumir la API de OMDb |
| **IntelliJ IDEA** | IDE de desarrollo |
| **Git** | Control de versiones |

## ▶️ Cómo ejecutar

1. Clona el repositorio:
   ```bash
   git clone https://github.com/JoseBenin82/screenmatch-poo.git
   ```
2. Abrí el proyecto en IntelliJ IDEA.
3. Ejecutá cualquiera de las clases `main`:
   - `Principal.java` – Demo básico de POO
   - `PrincipalConBusqueda.java` – Búsqueda en OMDb (ingresá el nombre de una película)
   - `PrincipalConListas.java` – Colecciones y ordenamiento

## 📚 Conceptos cubiertos

- Clases y objetos
- Herencia (`Pelicula` y `Serie` → `Titulo`)
- Interfaces (`Clasificacion`)
- Polimorfismo
- Encapsulamiento (getters/setters)
- Colecciones (`ArrayList`, `List`)
- Comparadores (`Comparator`, `Comparable`)
- Consumo de APIs REST con `HttpClient`
- Manejo de JSON con `Gson` o parsing manual

## 📄 Licencia

Este proyecto fue creado con fines educativos como parte del programa Oracle Next Education.
