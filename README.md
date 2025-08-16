# Optimización de Portafolio de Inversiones - ESPE

Este proyecto implementa una aplicación web para la **optimización de portafolios de inversión**, desarrollada en el marco de la asignatura **Arquitectura de Software** de la **Universidad de las Fuerzas Armadas ESPE**.  

Permite ingresar un presupuesto y un conjunto de proyectos de inversión, y mediante un algoritmo de optimización (implementado en el backend con **Spring Boot**) se calcula la combinación óptima de proyectos que maximiza la ganancia total.  

El frontend está construido con **HTML, TailwindCSS, FontAwesome y Chart.js**, proporcionando una interfaz intuitiva, interactiva y con visualizaciones dinámicas.  

---

## Tecnologías Utilizadas

### Backend
- **Java 17**
- **Spring Boot 3.x** (generado con *Spring Initializr*)
- **Spring Web** (para la API REST)
- **Spring DevTools** (hot reload)
- **Maven** como gestor de dependencias

### Frontend
- **HTML5** + **CSS3**
- **Tailwind CSS** (para estilos modernos y responsivos)
- **FontAwesome** (íconos)
- **Chart.js** (gráficos dinámicos)

### Herramientas
- **IntelliJ IDEA Ultimate** (IDE principal de desarrollo)
- **Postman / Thunder Client** (para pruebas de API)
- **Git + GitHub** (control de versiones)

---

## Estructura del Proyecto

```bash
optimización-portafolio/
│── backend/                # Proyecto Spring Boot (API REST)
│   ├── src/main/java/com/espe/optimizacion
│   │   ├── controller/     # Controladores REST
│   │   ├── service/        # Lógica de negocio
│   │   ├── model/          # Entidades (Proyecto, Resultado, etc.)
│   │   └── OptimApplication.java
│   └── src/main/resources/
│       └── application.properties
│
│── frontend/
│   └── index.html          # Interfaz gráfica con Tailwind + Chart.js
│
│── README.md
│── pom.xml                 # Configuración Maven

---
## Configuración del Backend
### 1. Clonamos el repositorio
```bash
git clone https://github.com/usuario/optimizacion-portafolio.git
cd optimizacion-portafolio/backend
Compilamos y ejecutamos el servidor:

mvn spring-boot:run


El backend quedará disponible en:

http://localhost:8080


Endpoint principal:

POST /api/optimizar


Ejemplo de request JSON:

{
  "capacidad": 10000,
  "objetos": [
    { "nombre": "Fondo_A", "peso": 2000, "ganancia": 1500 },
    { "nombre": "Fondo_B", "peso": 4000, "ganancia": 3500 }
  ]
}


Ejemplo de response JSON:

{
  "gananciaTotal": 5000,
  "pesoTotal": 6000,
  "seleccionados": ["Fondo_A", "Fondo_B"]
}

Frontend

Abrimos el archivo:

cd frontend
open index.html


o simplemente lo abrimos en nuestro navegador.

La aplicación permite:

Ingresar presupuesto total

Añadir múltiples proyectos (costo y ganancia)

Calcular la combinación óptima

Ver resultados en:

Tarjetas resumen (ganancia total, inversión utilizada, eficiencia)

Tabla de proyectos seleccionados

Gráfico comparativo (Chart.js)


Información Académica

Universidad de las Fuerzas Armadas ESPE

Carrera: Ingeniería en Tecnologías de la Información – Modalidad En Línea

Asignatura: Arquitectura de Software

Docente: Ing. Geovanny Cudco
