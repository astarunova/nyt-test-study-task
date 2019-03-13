package mostEmailed;

import lombok.*;
import mostEmailed.entities.Result;

import java.util.ArrayList;

@Data
@Getter @Setter
public class MostEmailedResponse {

    private String status;
    private String copyright;
    private int num_results;
    private ArrayList<Result> results;

    public MostEmailedResponse() {}

    public MostEmailedResponse(String status, String copyright, int num_results, ArrayList<Result> results) {
        this.status = status;
        this.copyright = copyright;
        this.num_results = num_results;
        this.results = results;
    }
}

