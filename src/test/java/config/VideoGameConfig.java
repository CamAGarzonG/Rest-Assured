package config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import org.junit.BeforeClass;
import io.restassured.RestAssured;

public class VideoGameConfig {

    @BeforeClass
    public static void setup(){
        //RestAssured.baseURI = "https://www.videogamedb.uk/";
        //RestAssured.basePath = "api/v2/";
        //RestAssured.port = 443;

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.videogamedb.uk/").setBasePath("api/v2/")
                .setContentType("application/json")
                .addHeader("Accept","application/json").build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200).build();


    }
}
