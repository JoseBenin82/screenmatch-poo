# ScreenMatch

Proyecto educativo de **Java** desarrollado como parte del curso de **Programación Orientada a Objetos (POO)** de [Alura Cursos](https://www.alura.com.br/) y [Oracle Next Education](https://www.oracle.com/education/).

ScreenMatch es una aplicación de consola que simula un catálogo de películas y series, demostrando los fundamentos de la POO en Java.

## Funcionalidades

- **Modelado de dominio**: Clases `Pelicula`, `Serie`, `Episodio` con herencia desde `Titulo`
- **Sistema de clasificación**: Evaluación de títulos con clasificación por estrellas (0-5)
- **Filtro de recomendación**: Sugerencias basadas en la clasificación
- **Calculadora de tiempo**: Suma la duración total de una colección de títulos (polimorfismo)
- **Consumo de API**: Búsqueda de películas en la [OMDb API](http://www.omdbapi.com/) mediante `java.net.http`
- **Serialización JSON**: Persistencia de datos en `titulos.json` con `Gson` y `FileWriter`
- **Manejo de excepciones**: Captura de errores de conversión, URI y formato con excepción personalizada
- **Colecciones y ordenamiento**: `ArrayList`, `Collections.sort()`, `Comparator` y `Comparable`
- **Pattern matching**: Uso de `instanceof` con pattern matching en Java

## Estructura del proyecto

```
src/
└── com/aluracursos/screenmatch/
    ├── calculos/
    │   ├── CalculadoraDeTiempo.java
    │   ├── Clasificacion.java
    │   └── FiltroRecomendacion.java
    ├── excepcion/
    │   └── ErroDuracionConversionException.java
    ├── modelos/
    │   ├── Episodio.java
    │   ├── Pelicula.java
    │   ├── Serie.java
    │   ├── Titulo.java
    │   └── TituloOmdb.java
    └── principal/
        ├── Principal.java
        ├── PrincipalConBusqueda.java
        └── PrincipalConListas.java
```

## Stack tecnologico

| Tecnologia | Descripcion |
|---|---|
| **Java 25** | Lenguaje principal |
| **java.net.http** | Cliente HTTP para consumir la API de OMDb |
| **Gson** | Libreria para serializacion/deserializacion JSON |
| **IntelliJ IDEA** | IDE de desarrollo |
| **Git** | Control de versiones |

## Como ejecutar

1. Clona el repositorio.
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta cualquiera de las clases `main`:
   - `Principal.java` - Demo basico de POO
   - `PrincipalConBusqueda.java` - Busqueda en OMDb (ingresa el nombre de una pelicula)
   - `PrincipalConListas.java` - Colecciones y ordenamiento

## Conceptos cubiertos

- Clases y objetos
- Herencia (`Pelicula` y `Serie` -> `Titulo`)
- Interfaces (`Clasificacion`)
- Records (`TituloOmdb`)
- Polimorfismo
- Encapsulamiento (getters/setters)
- Colecciones (`ArrayList`, `List`)
- Comparadores (`Comparator`, `Comparable`)
- Consumo de APIs REST con `HttpClient`
- Serializacion JSON con `Gson` y `FileWriter`
- Manejo de excepciones y excepcion personalizada
- Pattern matching con `instanceof`

## Archivos de datos

- `peliculas.txt` - Archivo de texto con datos de peliculas
- `titulos.json` - Archivo JSON generado con resultados de busqueda

## Licencia

Este proyecto fue creado con fines educativos como parte del programa Oracle Next Education.
