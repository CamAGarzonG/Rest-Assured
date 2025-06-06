package config;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.BeforeClass;


public class VideoGameConfig {

    @BeforeClass
    public static void setup(){
        //RestAssured.baseURI = "https://www.videogamedb.uk/";
        //RestAssured.basePath = "api/v2/";
        //RestAssured.port = 443;

        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://www.videogamedb.uk/").setBasePath("api/v2/")
                .setContentType("application/json")
                .addHeader("Accept","application/json")
                .addFilter(new RequestLoggingFilter())
                .addFilter(new ResponseLoggingFilter())
                .build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();


    }
}
