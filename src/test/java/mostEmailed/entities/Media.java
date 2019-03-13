package mostEmailed.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

import java.util.ArrayList;

@Data
@Getter @Setter
public class Media {

    private String type;
    private String subtype;
    private String caption;
    private String copyright;
    private int approved_for_syndication;
    @JsonProperty("media-metadata")
    private ArrayList<MediaMetadata> media_metadata;

    public Media() {}

    public Media(String type, String subtype, String caption, String copyright, int approved_for_syndication, ArrayList<MediaMetadata> media_metadata) {
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
        this.approved_for_syndication = approved_for_syndication;
        this.media_metadata = media_metadata;
    }
    @JsonSetter("media-metadata")
    public void setMedia_metadata(ArrayList<MediaMetadata> media_metadata) {
        this.media_metadata = media_metadata;
    }
}
