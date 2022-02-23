### Hi there 👋

Consigna:

Ejercicio Back-end

Desarrollar una API para el registro nacional de las personas, la cual permitirá registrar a toda persona recien nacida, con sus datos basicos (nombre, apellido, fecha de nacimiento, sexo y dni). La api debe permitir el cambio de sexo de una persona. Además de poder consultar una persona particular y la búsqueda de personas con las primeras tres letras del apellido.

Por otro lado, deberá exponer la información para que cualquier frontend pueda consumirla.

● Se valorará utilizar Spring Boot.

● Se valorará utilizar MVC

● En caso de no poder completar la totalidad del ejercicio, realizarlo hasta donde pueda y dejarlo lo más parecido posible.

● No luchar con detalles no esenciales, ante dudas o ambigüedades del enunciado tomar una decisión y, si se cree necesario, justificar.

● Focalizarse en desarrollar lo que se pide, no es necesario ni recomendable realizar

funcionalidad extra.

● Subir el proyecto a un repositorio de Github o Gitlab

● Puntos extra por documentar en Swagger o Postman.

● Puntos extra por test.



Consideraciones:
En en la carpeta resources/main/application.properties borre o cambie el usuario y password, por el local de lo contrario no compila.

spring.datasource.username=postgres
spring.datasource.password=admin

Resolucion:
Se encuentran la logica para registrar nuevos usuarios a la base de datos, modificar el sexo de una persona registrada y puede buscar una persona especifica.
La base de datos usada es postgresDB.
No se uso un modelo de vista-controlador.
Falto una funcionalidad, buscar personas por los primeros 3 digitos del apellido.
Se usó Spring boot Maven como framework.
No se documentó en Postamn ni Swagger.

No se encuentra testeado.

<!--
**MaraiNicolas/MaraiNicolas** is a ✨ _special_ ✨ repository because its `README.md` (this file) appears on your GitHub profile.

Here are some ideas to get you started:

- 🔭 I’m currently working on ...
- 🌱 I’m currently learning ...
- 👯 I’m looking to collaborate on ...
- 🤔 I’m looking for help with ...
- 💬 Ask me about ...
- 📫 How to reach me: ...
- 😄 Pronouns: ...
- ⚡ Fun fact: ...
-->
