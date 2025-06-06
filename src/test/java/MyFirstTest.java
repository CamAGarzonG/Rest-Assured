import config.VideoGameConfig;
import config.VideoGameEndponts;

import org.junit.Test;
import static io.restassured.RestAssured.*;


public class MyFirstTest extends VideoGameConfig {

    @Test
    public void myFirstTest() {
        given()
                .log().all()
        .when()
                //.get("https://videogamedb.uk/api/videogame")
                .get("/videogame")
        .then()
                .log().all();
    }

    @Test
    public void testWithEndpoint(){
        get(VideoGameEndponts.ALL_VIDEO_GAMES)
                .then().log().all();
    }

}
