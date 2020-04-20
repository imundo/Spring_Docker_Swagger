# AppClimaSantiago
Prueba

# Preparaciones Iniciales:
-Tener Instalado Java 1.8 y superior

-Tener Instalado Maven

-Tener Postgresql

-Crear base de datos en postgres segun esta configurado en el aplication.yml 

Ejemplo:
"# Database
  datasource:
    driver-class-name: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/c1?createDatabaseIfNotExist=true
    username: abc	
    password: abc123"
    
    
-En el aplication.yml se puede personalizar niveles de seguridad, conexiones, entre otrs de ser necesario.

# Para Copilar y ejecutar correr el siguiente comando en raiz de proyecto:

mvn clean spring-boot:run

# Metodos y Endpoint son los siguientes:

-Agregar nuevo Tienda:

POST /api/Tienda

http://localhost:8081/api/Tienda

<img src="https://github.com/imundo/AppClimaSantiago/blob/master/img/addClima.PNG">


-Mostrar todos los Climas Registrados:

GET /api/Tienda

http://localhost:8081/api/Tienda

<img src="https://github.com/imundo/AppClimaSantiago/blob/master/img/viewClima.PNG">



-Buscar Clima por ID: 

GET /api/Tienda/{id}

http://localhost:8081/api/Tienda/{id}



-Buscar Clima por Nombre: 

GET /api/Tienda/?name=name

http://localhost:8081/api/Tienda/?name=name



-Borrar Clima por ID: 

DELETE /api/Tienda/{id}

http://localhost:8081/api/Tienda/{id}



-Borrar todos los registros

DELETE /api/Tienda

http://localhost:8081/api/Tienda







