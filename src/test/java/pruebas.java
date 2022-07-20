import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

public class pruebas {

    //      EJEMPLO PARA LOS CASOS DE SIMULACION
    @Test
    public void loginTest(){
        String respuesta = RestAssured
                .given()
                .log().all() //log sobre el request
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"email\": \"eve.holt@reqres.in\",\n" +
                        "    \"password\": \"cityslicka\"\n" +
                        "}")
                .post("https://reqres.in/api/login")
                .then()
                .log().all() //log sobre la respuesta
                .extract()
                .asString();
    //    System.out.println(respuesta);
    }

    //      SIMULACION
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
                .log().all()
                .extract()
                .asString();

    }
}
