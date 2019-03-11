package mostEmailed;

import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MostPopularLogic {

    public static Set<String> filterUniqueSections(Response response){
        ArrayList<String> allSections = response.path("results.section");
        Set<String> uniqueSections = new HashSet<String>(allSections);
        return uniqueSections;
    }
}
