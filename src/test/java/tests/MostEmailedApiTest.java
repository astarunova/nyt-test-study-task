package tests;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import mostEmailed.MostEmailedResponse;
import mostEmailed.MostPopularLogic;
import org.json.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class MostEmailedApiTest {

Configuration propConf = new Configuration();
    @BeforeClass
    public void setup() {
        baseURI = propConf.getProp("base.url");
    }
    ResponseSpecification specs =
            new ResponseSpecBuilder().
                    expectStatusCode(200).
                    expectContentType(ContentType.JSON).
                    build();

    @Test
    public void getMostEmailedArticlesSections() {
    Response mostEmailedArticlesResponse =
                 given().//log().all().
                        param("api-key", propConf.getProp("api.key")).
                        when().
                        get("/svc/mostpopular/v2/emailed/{period}.json", 1).
                        then().//log().body().
                        spec(specs).
                        extract().response();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        try {
            MostEmailedResponse mappedResponse = objectMapper.readValue(mostEmailedArticlesResponse.asString(), MostEmailedResponse.class);
            JSONObject jsonObj = new JSONObject(mappedResponse);
            System.out.println(jsonObj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // assertEquals();

    }
}
