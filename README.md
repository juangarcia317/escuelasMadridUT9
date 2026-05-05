# 🏫 API Escuelas Municipales de Madrid

Este proyecto es una aplicación web desarrollada con **Spring Boot** que gestiona y visualiza el listado de escuelas municipales de arte (Cerámica, Danza, Música y Arte Dramático) de Madrid. 

## 📊 Origen de los Datos
La información utilizada en este proyecto proviene del **Portal de datos abiertos del Ayuntamiento de Madrid**.
*   **Dataset:** [Escuelas municipales de música y danza, cerámica y arte dramático](https://datos.madrid.es/dataset/203868-0-ceramica-danza-musica-dramatico)
*   **Formato original:** JSON

## 🚀 Tecnologías utilizadas
*   **Java 17**
*   **Spring Boot 3.x**: Framework principal para la lógica y el servidor.
*   **Spring Data MongoDB**: Para la persistencia de datos en una base NoSQL.
*   **Thymeleaf**: Motor de plantillas para renderizar la interfaz web.
*   **Bootstrap 5**: Framework CSS para el diseño visual y responsivo.
*   **Maven**: Gestión de dependencias y construcción del proyecto.

## 📋 Requisitos previos
*   Tener instalado **Java JDK**.
*   Tener una instancia de **MongoDB** (local o en la nube).
*   Tener el archivo JSON del portal de datos de Madrid importado en la colección `escuelas_madrid`.

