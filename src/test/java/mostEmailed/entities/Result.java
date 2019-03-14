package mostEmailed.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;
import java.util.List;

@Data
public class Result {

    @JsonProperty("url")
    private String url;
    @JsonProperty("adx_keywords")
    private String adxKeywords;
    @JsonProperty("subsection")
    private String subsection;
    @JsonProperty("email_count")
    private int emailCount;
    @JsonProperty("count_type")
    private String countType;
    @JsonProperty("column")
    private String column;
    @JsonProperty("eta_id")
    private int etaId;
    @JsonProperty("section")
    private String section;
    @JsonProperty("id")
    private long id;
    @JsonProperty("asset_id")
    private long assetId;
    @JsonProperty("nytdsection")
    private String nytdsection;
    @JsonProperty("byline")
    private String byline;
    @JsonProperty("type")
    private String type;
    @JsonProperty("title")
    private String title;
    @JsonProperty("abstract")
    private String _abstract;
    @JsonProperty("published_date")
    private String publishedDate;
    @JsonProperty("source")
    private String source;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("des_facet")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private  List<String> desFacet;
    @JsonProperty("org_facet")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<String> orgFacet;
    @JsonProperty("per_facet")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private  List<String>perFacet;
    @JsonProperty("geo_facet")
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private List<String> geoFacet;
    @JsonProperty("media")
    private List<Media> media;
    @JsonProperty("uri")
    private String uri;

    public Result() {}

    public Result(String url, String adxKeywords, String subsection, int emailCount, String countType, String column, int etaId, String section, long id, long assetId, String nytdsection, String byline, String type, String title, String _abstract, String publishedDate, String source, String updated, List<String> desFacet, List<String> orgFacet, List<String> perFacet, List<String> geoFacet, List<Media> media, String uri) {
        this.url = url;
        this.adxKeywords = adxKeywords;
        this.subsection = subsection;
        this.emailCount = emailCount;
        this.countType = countType;
        this.column = column;
        this.etaId = etaId;
        this.section = section;
        this.id = id;
        this.assetId = assetId;
        this.nytdsection = nytdsection;
        this.byline = byline;
        this.type = type;
        this.title = title;
        this._abstract = _abstract;
        this.publishedDate = publishedDate;
        this.source = source;
        this.updated = updated;
        this.desFacet = desFacet;
        this.orgFacet = orgFacet;
        this.perFacet = perFacet;
        this.geoFacet = geoFacet;
        this.media = media;
        this.uri = uri;
    }
}
