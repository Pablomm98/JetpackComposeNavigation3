
# Jetpack Compose Navigation 3

Proyecto de ejemplo de cómo utilizar la navegación entre pantallas que tiene Jetpack Compose con Navigation en su versión 3 junto con la serialización de Kotlin donde las rutas ahora son clases u objetos.




## Importante a tener en cuenta para correcto funcionamiento
Es necesario añadir algunas librerías en el archivo libs.versions.toml para la serialización y Navigation 3
```gradle
androidx-navigation3-runtime = { module = "androidx.navigation3:navigation3-runtime", version.ref = "nav3Core"}
androidx-navigation3-ui = {module = "androidx.navigation3:navigation3-ui", version.ref = "nav3Core"}
kotlinx-serialization-core = {module = "org.jetbrains.kotlinx:kotlinx-serialization-core", version.ref = "kotlinxSerializationCore"}
```
Y sus correspondientes versiones (son las últimas versiones disponibles en el momento de creación de la app)
```gradle
kotlinxSerializationCore = "1.10.0"
kotlinSerialization = "2.3.20"
```
Además del plugin de serialización de kotlin
```gradle
jetbrains-kotlin-serialization = { id = "org.jetbrains.kotlin.plugin.serialization", version.ref = "kotlinSerialization"}
```

En el gradle del módulo APP es necesario añadir el plugin de kotlin.serialization

```gradle
alias(libs.plugins.jetbrains.kotlin.serialization)
```
Y las dependencias correspondientes para Navigation 3 y las serialización

```gradle
implementation(libs.androidx.navigation3.runtime)
implementation(libs.androidx.navigation3.ui)
implementation(libs.kotlinx.serialization.core)
```

## Autor

- [Pablo Martín](https://www.github.com/Pablomm98)
- [LinkedIn](https://www.linkedin.com/in/pablo-martín-maría)

