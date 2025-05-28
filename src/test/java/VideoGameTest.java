import config.VideoGameConfig;
import config.VideoGameEndponts;
import org.junit.Test;

import java.security.PublicKey;

import static io.restassured.RestAssured.*;

public class VideoGameTest extends VideoGameConfig{

    String gameBodyJson = "{\n" +
            "   \"category\": \"Platform\",\n"+
            "   \"name\": \"Mario\",\n"+
            "   \"rating\": \"Mature\",\n"+
            "   \"releaseDate\": \"2012-05-04\",\n"+
            "   \"reviewScore\": 99\n"+
            "}";

    @Test
    public void getAllGames(){
        given()
        .when()
                .get(VideoGameEndponts.ALL_VIDEO_GAMES)
        .then();
    }

    @Test
    public void createNewGame(){
        /*Missing the XML instead of JSON*/
        given()
                .body(gameBodyJson)
        .when()
                .post(VideoGameEndponts.ALL_VIDEO_GAMES)
        .then();
    }

    @Test
    public void updateGame(){
        given()
                .body(gameBodyJson)
        .when()
                .put("videogames/3")
        .then();
    }

    @Test
    public void deleteGame(){
        given()
                .body("test/plain")
        .when()
                .put("videogames/3")
        .then();
    }

    // ********* PATH PARAMETERS *********
    @Test
    public void getSingleGame(){
        given()
                .pathParam("idGame", "5")
        .when()
                .get(VideoGameEndponts.ONE_VIDEO_GAMES)
        .then();
    }

}
