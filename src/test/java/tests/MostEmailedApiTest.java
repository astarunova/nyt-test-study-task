package tests;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class MostEmailedApiTest {
    int numResults;
    public Set<String> allSections = new HashSet<String>();
    public Map<String,Integer> articlesBySection = new HashMap<>();

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
    public void test_01_getMostEmailedArticlesSections() {
        Response response =
                given().log().all().
                        param("api-key", propConf.getProp("api.key")).
                        when().
                        get("/svc/mostpopular/v2/emailed/{period}.json", 1).
                        then().log().body().
                        spec(specs).
                        extract().response();
        MostEmailedResponse mostEmailedArticlesResponse = response.getBody().as(MostEmailedResponse.class);
        allSections = MostPopularLogic.filterUniqueSections(response);
        numResults = response.path("num_results");
        assertEquals(numResults, mostEmailedArticlesResponse.getNumResults());
    }

    @Test
    public void test_02_getArticleNumberBySection() {
        Map<String,Integer> articlesNumber = new HashMap<String,Integer>();
        int generalArticlesNumber=0;
        for(int i=0; i<allSections.size();i++){
        Response response =
                  given().log().all().
                    param("api-key", propConf.getProp("api.key")).
                    when().
                    get("/svc/mostpopular/v2/mostemailed/{section}/{period}.json", allSections.toArray()[i], 1).
                    then().log().body().
                    spec(specs).
                    extract().response();
            int numResult = response.path("num_results");
            articlesNumber.put(allSections.toArray()[i].toString(), numResult);
        }
        System.out.println(articlesNumber);
        for (Map.Entry<String, Integer> item: articlesNumber.entrySet()) {
            System.out.println(item.getKey() + item.getValue());
            generalArticlesNumber += item.getValue();
            System.out.println(item.getValue());
        }
        assertEquals(generalArticlesNumber, numResults);
    }
  }
