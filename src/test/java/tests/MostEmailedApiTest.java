package tests;

import mostEmailed.MostPopularLogic;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class MostEmailedApiTest {

Configuration propConf = new Configuration();

    @BeforeClass
    public void setup() {
        baseURI = propConf.getProp("base.url");
    }
    @Test
    public void getMostEmailedArticlesSections() {
        Response mostEmailedArticlesResponse =
                given().log().all().
                        param("api-key", propConf.getProp("api.key")).
                        when().
                        get("/svc/mostpopular/v2/emailed/{period}.json", 1).
                        then().log().body().statusCode(200).
                        extract().response();
        MostPopularLogic.filterUniqueSections(mostEmailedArticlesResponse);
    }
}
