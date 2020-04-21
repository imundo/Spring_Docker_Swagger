# Spring_Docker_Swagger

servicio CRUD con Springboot, Swagger para documentacion y postgresql como BD, tambien 

# Preparaciones Iniciales:
-Tener Instalado Java 1.8 y superior

-Tener Instalado Maven

-Docker

-Crear base de datos en postgres segun esta configurado en el aplication.yml 

Ejemplo:
"# Database
  datasource:
    driver-class-name: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/c1?createDatabaseIfNotExist=true
    username: abc	
    password: abc123"
    
    
-En el aplication.yml se puede personalizar niveles de seguridad, conexiones, entre otrs de ser necesario.

# Para Copilar y ejecutar correr el siguiente comando en raiz de proyecto de forma LOCAL:

mvn clean spring-boot:run

# Para Copilar y ejecutar correr el siguiente comando en raiz de proyecto dentro de container Dockers:

mvn clean install

mvn clean install -DskipTests=true (Si desea saltar test)

docker-compose up --build

# Swagger Documentacion de Servicio:

http://localhost:8080/swagger-ui.html#

<img src="https://github.com/imundo/Spring_Docker_Swagger/blob/master/img/img2.JPG">


<img src="https://github.com/imundo/Spring_Docker_Swagger/blob/master/img/img4.JPG">

# Metodos y Endpoint son los siguientes:

-Agregar nuevo Tienda:

POST /api/Tienda

http://localhost:8081/api/Tienda

<img src="https://github.com/imundo/Spring_Docker_Swagger/blob/master/img/img3.JPG">


-Mostrar todos los Climas Registrados:

GET /api/Tienda

http://localhost:8081/api/Tienda

<img src="https://github.com/imundo/Spring_Docker_Swagger/blob/master/img/img1.JPG">



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







