package config;

import org.junit.BeforeClass;
import io.restassured.RestAssured;

public class TestConfig {

    @BeforeClass
    public static void setup(){
        RestAssured.baseURI = "https://www.videogamedb.uk/";
        RestAssured.basePath = "api/v2/";
        //RestAssured.port = 443;
    }
}
