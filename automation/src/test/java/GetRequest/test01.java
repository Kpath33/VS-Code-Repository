package GetRequest;

import org.testng.annotations.Test;

import java.net.http.HttpRequest;

import io.restassured.RestAssured;

public class test01 {
    @Test
    public void test01() {
        RestAssured.baseURI = "https://reqres.in";
        RestAssured.basePath = "/api/users/2";
        RestAssured.given().get().then().statusCode(200).log().all();
        if (RestAssured.given().get().getStatusCode() == 200) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
            
        }
    System.out.println("Response time: " + RestAssured.given().get().getTime());
    }


}
