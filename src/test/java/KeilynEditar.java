import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import javax.sound.midi.Patch;

public class KeilynEditar {
    @Test
    public void EditTest(){
        String response = RestAssured //variable para almacenar la respuesta y verla luego
                .given()
                .contentType(ContentType.JSON) //Especificamos primero el contenido//
                .body(  "{\n" +
                        "    \"name\": \"morpheus\",\n" +
                        "    \"job\": \"zion resident\"\n" +
                        "}") //contenido de la solicitud o acción que voy a ejecutar en la prueba//
                .patch ("https://reqres.in/api/users/2") //URL pagina de prueba//
                .then() //respuesta que me va a dar//
                .extract() //Le sentencio extraerla como string//
                .asString();
        System.out.println(response); //para imprimir la respuesta




    }
}
