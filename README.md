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
### 1. Clonar el repositorio
```bash
git clone https://github.com/usuario/optimizacion-portafolio.git
cd optimizacion-portafolio/backend
