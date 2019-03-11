package mostEmailed.entities;

import lombok.*;

import java.util.ArrayList;

@Data
@NoArgsConstructor

public class Result {

    private String url;
    private String count_type;
    private String column;
    private String section;
    private String byline;
    private String title;
    private String abstractPassage;
    private String published_date;
    private String source;
    private ArrayList<String> des_facet;
    private ArrayList<String> org_facet;
    private String per_facet;
    private String geo_facet;
    private ArrayList<Media> media;

    public Result(String url, String count_type, String column, String section, String byline, String title, String abstractPassage, String published_date, String source, ArrayList<String> des_facet, ArrayList<String> org_facet, String per_facet, String geo_facet, ArrayList<Media> media) {
        this.url = url;
        this.count_type = count_type;
        this.column = column;
        this.section = section;
        this.byline = byline;
        this.title = title;
        this.abstractPassage = abstractPassage;
        this.published_date = published_date;
        this.source = source;
        this.des_facet = des_facet;
        this.org_facet = org_facet;
        this.per_facet = per_facet;
        this.geo_facet = geo_facet;
        this.media = media;
    }
}
