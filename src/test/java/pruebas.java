import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.equalTo;

public class pruebas {


    //      REST ASSURED

    //      ~ REQUERIMIENTOS ~
    //      JDK
    //      INTELLIJ IDEA
    //      RoboPOJOGenerator --> INTELLIJ
    //      GRADLE --> SISTEMA DE AUTOMATIZACIN DE CONSTRUCCION DEL CODIGO SOFTWARE QUE CONSTRUYE SOBRE LOS CONCEPTOS DE APACHE ANT Y APACHE MAVEN

    //      ~ DEPENDENCIAS ~
    //      IO.REST-ASSURED
    //      JUNIT

    //      ~ API ~
    //      POST
    //      GET
    //      PUT
    //      DELETE

    //      EJEMPLO PARA LOS CASOS DE SIMULACION --> POST
    @Test       //  ANOTACION DE JUNIT

    public void loginTest(){
        RestAssured
                .given()
                .log().all()            // LOG SOBRE EL REQUEST --> SE PUEDE VER LO QUE SE ENVIA
                .contentType(ContentType.JSON)          // PRIMERO DEBEMOS DE ESPECIFICAR EL TIPO, EN ESTE CASO --> JSON
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("https://reqres.in/api/login")            // DESTINO DEL BODY
                .then()         // RESPUESTA DEL POST
                .log()          // LOG SOBRE LA RESPUESTA --> SE PUEDE VER LO QUE SE RECIBE
                .all()
                .statusCode(300)       // RESPUESTA ESPERADA DEL APIA (ASERCIONES) SE UTILIZA HAMCREST PARA CREAR ASERCIONES
                // LA LINEA ANTERIOR FALLA YA QUE EL CODIGO DE RESPUESTA REALMENTE ES "200"
                .body("token", notNullValue());         // VALIDACION DEL TOKEN DISTINTO A NULL


    //    System.out.println(respuesta);
    }

    //      SIMULACION --> POST
    @Test
    public void create (){

        RestAssured
                .given() //
                .log().all()
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"leader\"\n" +
                        "}")
                .post("https://reqres.in/api/users")
                .then()
                .log()
                .all()
                //.extract()
                //.asString();
                .statusCode(201)
                .body("job", equalTo("leader"));
    }


    @Test
    public void getSingleUser(){

        //          SIMULACION --> GET
        RestAssured
                .given() //
                .log().all()
                .contentType(ContentType.JSON)
                .get("https://reqres.in/api/users/2")
                .then()
                .log()
                .all()
                .statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"));
    }


}
