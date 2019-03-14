package mostEmailed;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import mostEmailed.entities.Result;

import java.util.ArrayList;
import java.util.List;

@Data
public class MostEmailedResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("num_results")
    private int numResults;
    @JsonProperty("results")
    private List<Result> results;

    public MostEmailedResponse() {}

    public MostEmailedResponse(String status, String copyright, int numResults, List<Result> results) {
        this.status = status;
        this.copyright = copyright;
        this.numResults = numResults;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }
}

