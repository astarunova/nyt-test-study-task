package mostEmailed.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

import java.util.ArrayList;

@Data
public class Media {

    @JsonProperty("type")
    private String type;
    @JsonProperty("subtype")
    private String subtype;
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("copyright")
    private String copyright;
    @JsonProperty("approved_for_syndication")
    private int approvedForSyndication;
    @JsonProperty("media-metadata")
    private ArrayList<MediaMetadata> mediaMetadata;

    public Media() {}

    public Media(String type, String subtype, String caption, String copyright, int approvedForSyndication, ArrayList<MediaMetadata> mediaMetadata) {
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
        this.approvedForSyndication = approvedForSyndication;
        this.mediaMetadata = mediaMetadata;
    }
}
