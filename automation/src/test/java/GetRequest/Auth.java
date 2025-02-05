package GetRequest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class Auth {

    @Test
    public void test01() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users/2";
        RestAssured.given()
            .auth().basic("username", "password")
            .get()
            .then()
            .statusCode(200)
            .log().all();
        
        if (RestAssured.given().auth().basic("username", "password").get().getStatusCode() == 200) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}