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

public class NytApiTest {

public static Properties pullingProperties() {
    Properties prop = new Properties();
    try {
        prop.load(NytApiTest.class.getResourceAsStream("config.properties"));
    } catch (Exception e) {
        System.err.println("File does not exist");
    }
    return prop;
}
    @BeforeClass
    public void setup() {
        baseURI = pullingProperties().getProperty("base.url");
    }
    @Test
    public void getMostEmailedArticles() {
        System.out.println(baseURI);
        given().log().all().
                param("api-key", pullingProperties().getProperty("api.key")).
        when().
                get("/svc/mostpopular/v2/emailed/{period}.json", 1).
                then().log().body().statusCode(200);

    }

}
