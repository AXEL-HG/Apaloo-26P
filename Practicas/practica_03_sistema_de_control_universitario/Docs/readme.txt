# Sistema de Gestión Universitaria 🏛️

Este repositorio contiene la solución para la **Práctica 3: Sistema de Gestión Universitaria**, enfocada en el desarrollo de un sistema orientado a objetos en Java que representa a las personas y entidades de una universidad.

## 🎯 Objetivos de la Práctica
* Identificar la información que debe almacenar un objeto (atributos).
* Definir las acciones que puede realizar un objeto (métodos).
* Reutilizar código de manera eficiente mediante **Herencia**.
* Almacenar colecciones de objetos utilizando **Arreglos nativos (`[]`)**.
* Establecer relaciones lógicas entre diferentes clases.

---

## 📌 Índice
1. [Conceptos Clave](#-conceptos-clave)
2. [Investigación Obligatoria](#-investigación-obligatoria)
3. [Estructura y Jerarquía de Clases](#-estructura-y-jerarquía-de-clases)
4. [Requisitos de Implementación](#-requisitos-de-implementación)
5. [Pruebas en el Programa Principal](#-pruebas-en-el-programa-principal)

---

## 🧠 Conceptos Clave
* **Clase:** Plantilla o molde que describe cómo serán los objetos.
* **Objeto:** Una instancia física/concreta de una clase.
* **Atributo:** Variables que almacenan la información o estado del objeto.
* **Método:** Funciones que representan las acciones que puede realizar el objeto.

---

## 🔍 Investigación Obligatoria

### 1. Uso de Fechas (`java.time`)
Para el manejo de fechas de nacimiento, ingreso y contratación, se utilizará la API nativa de Java:
* **`LocalDate`**: Utilizada para representar fechas sin zona horaria en formato `yyyy-MM-dd` *(Clase principal requerida para esta práctica)*.
* **`LocalTime`**: Representa la hora (`HH-mm-ss-ns`).
* **`LocalDateTime`**: Combina fecha y hora.
* **`DateTimeFormatter`**: Permite formatear y parsear los objetos de fecha.

### 2. Arreglo de Objetos
Se debe implementar el almacenamiento utilizando arreglos fijos de objetos en lugar de colecciones dinámicas. Ejemplo:
```java
Estudiante[] estudiantes = new Estudiante[50]; // Capacidad máxima de 50 estudiantes