# simulacion

>*Simulación Rest API*
Keilyn Agüero Calvo, Steven Campos Matamoros, Oscar Daniel Sánchez Acuña & Sebastián Hernández Jiménez
Grupo 8
Universidad Fidélitas, Heredia, Costa Rica
kaguero60383@ufide.ac.cr scampos90290@ufide.ac.cr 
Osanchez50519@ufide.ac.cr 
Shernandez30307@ufide.ac.cr


 
#I.	INTRODUCCIÓN
Las pruebas de API (Application Programming Interface) son un tipo de prueba de software que determina si una aplicación recién desarrollada cumple con las expectativas, en términos de confiabilidad, rendimiento, operaciones y seguridad. La presente simulación se basa en una serie de imitaciones de circunstancias basadas en la realidad en las cuales se aplican pruebas API teniendo como guía la página web: https://reqres.in/. Se utiliza el ambiente de desarrollo IntelliJ IDEA donde se importan librerías tales como io.restassured.RestAssured, org.junit.jupiter.api.Test y org.hamcrest.Matchers.notNullvalue. Además, se utiliza GitHub para el control de versiones y su organización.
II.	DESARROLLO
El término API es una abreviatura de Application Programming Interfaces, que en español significa interfaz de programación de aplicaciones. Se trata de un conjunto de definiciones y protocolos que se utiliza para desarrollar e integrar el software de las aplicaciones, permitiendo la comunicación entre dos aplicaciones de software a través de un conjunto de reglas. [1]
A.	Caso de simulación POST
Consiste en un caso de simulación POST donde se crean usuarios, se utiliza la ruta https://reqres.in/api/users y los parámetros “name”: “morpheus” y “job”: “leader”. Para la validación de la respuesta se utiliza la librería hamcrest.
B.	Caso de simulación PATCH
 Consiste en la ejecución del comando PATCH en el cual, siguiendo la ruta https://reqres.in/api/users/2 se envían los 		parámetros “name:” “morpheus” “job” “zion resident” de los cuales, al ejecutar el comando Patch, se espera una edición 	          del campo “job” enviado anteriormente, esto se realiza mediante una serie de variables y procesos que al trabajar en conjunto realizan la prueba API utilizando librería como RestAssured, Junit.Jupiter.Api.Test.

C.	Caso de simulación (Delete)
En este caso de simulación tipo Delete en el que se elimina un usuario, se utiliza la ruta  https://reqres.in/api/users/2  en este caso no se necesita ningún tipo de parámetros ya que solo se indica el número de usuario que se desea eliminar mediante la ruta 
D.	Caso de simulación (GET)
Consiste en ejecutar el comando Get en el cual se utiliza la siguiente ruta https://regres.in/api/users/2 para devolver un solo usuario con el id “2”, en el cual se indican los parámetros de la información de un solo usuario respectivo con su identificación 

 

III.	CONCLUSIONES
Al aplicar los conocimientos adquiridos mediante la investigación realizada podemos concluir que las pruebas de automatización API son de gran valor cuando nuestro objetivo está en identificar falencias de seguridad ya que un buen manejo de pruebas unitarias nos permite evitar problemas de manera rápida y eficiente examinando a profundidad los procesos a los que se va a someter el usuario inclusive antes de que dicha aplicación se encuentre en producción. Durante el presente curso de Calidad de Software hemos aprendido la importancia al detalle de las pruebas y como un buen empleo de estas puede facilitar el uso de las aplicaciones a los usuarios, proporcionando un puente entre su utilización y seguridad, en este caso, las pruebas Rest API (Estado representacional de transferencia) tiene como objetivo la comunicación entre el cliente y el servidor.
RECOMENDACIONES
Validar que se trate de un proyecto Gradle y contar con la instalación del plugin RoboPOJOGenerator cuando se utilice la         herramienta Intellij Idea. 
Priorizar los casos de prueba a ejecutar en base a los servicios ofrecidos por la aplicación/pagina, condiciones y requisitos de seguridad planteados por el cliente. 
Familiarizarse con los casos de pruebas que se desarrollarán investigando la herramienta adecuada para ejecutarlas y documentado las interacciones, así como las respuestas esperadas. 

REFERENCIAS

[1] 	X. Basics, "API: qué es y para qué sirve," 23 Agosto 2019. [Online]. Available: https://www.xataka.com/basics/api-que-sirve.


