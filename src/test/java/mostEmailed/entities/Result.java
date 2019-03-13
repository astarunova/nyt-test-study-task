package mostEmailed.entities;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import mostEmailed.JsonPropertyTypeConverter;

import java.util.ArrayList;
import java.util.Date;

@Data
@Getter @Setter
public class Result {

    private String url;
    private String adx_keywords;
    private String subsection;
    private int email_count;
    private String count_type;
    private String column;
    private int eta_id;
    private String section;
    private long id;
    private long asset_id;
    private String nytdsection;
    private String byline;
    private String type;
    private String title;
    @JsonProperty("abstract")
    private String abstractPassage;
    private String published_date;
    private String source;
    private String updated;
    private ArrayList<String> des_facet;
    private ArrayList<String> org_facet;
    private ArrayList<String> per_facet;
    private ArrayList<String> geo_facet;
    private ArrayList<Media> media;
    private String uri;

    public Result() {}

    public Result(String url, String adx_keywords, String subsection, int email_count, String count_type, String column, int eta_id, String section, long id, long asset_id, String nytdsection, String byline, String type, String title, String abstractPassage, String published_date, String source, String updated, ArrayList<String> des_facet, ArrayList<String> org_facet, ArrayList<String> per_facet, ArrayList<String> geo_facet, ArrayList<Media> media, String uri) {
        this.url = url;
        this.adx_keywords = adx_keywords;
        this.subsection = subsection;
        this.email_count = email_count;
        this.count_type = count_type;
        this.column = column;
        this.eta_id = eta_id;
        this.section = section;
        this.id = id;
        this.asset_id = asset_id;
        this.nytdsection = nytdsection;
        this.byline = byline;
        this.type = type;
        this.title = title;
        this.abstractPassage = abstractPassage;
        this.published_date = published_date;
        this.source = source;
        this.updated = updated;
        this.des_facet = des_facet;
        this.org_facet = org_facet;
        this.per_facet = per_facet;
        this.geo_facet = geo_facet;
        this.media = media;
        this.uri = uri;
    }

    @JsonSetter("abstract")
    public void setAbstractPassage(String abstractPassage) {
        this.abstractPassage = abstractPassage;
    }
}
