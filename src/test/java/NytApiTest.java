import org.json.JSONArray;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import java.io.*;
import java.util.Properties;

public class NytApiTest extends Configuration{

    @BeforeClass
    public void setup() {
        baseURI = getProp("base.url");
    }
    @Test
    public void getMostEmailedArticles() {
        given().log().all().
                param("api-key", getProp("api.key")).
        when().
                get("/svc/mostpopular/v2/emailed/{period}.json", 1).
                then().log().body().statusCode(200);

    }

}
