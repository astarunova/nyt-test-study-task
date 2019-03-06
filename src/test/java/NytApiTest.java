import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class NytApiTest {

    @BeforeTest
    public void setup() {
        baseURI = "https://api.nytimes.com";
    }
    @Test
    public void getMostEmailedArticles() {
        given().log().all().
                param("api-key", "6Q1FfFmOGfCibBqgCPBAx7AF27ZrGEl4").
        when().
                get("/svc/mostpopular/v2/emailed/{period}.json", 1).
                then().log().body().statusCode(200);

    }

}
