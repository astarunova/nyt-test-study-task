package mostEmailed.entities;

import lombok.*;

import java.util.ArrayList;

@Data
@NoArgsConstructor

public class Media {

    private String type;
    private String subtype;
    private String caption;
    private String copyright;
    private int approved_for_syndication;
    private ArrayList<MediaMetadata> media_metadata;

    public Media(String type, String subtype, String caption, String copyright, int approved_for_syndication, ArrayList<MediaMetadata> media_metadata) {
        this.type = type;
        this.subtype = subtype;
        this.caption = caption;
        this.copyright = copyright;
        this.approved_for_syndication = approved_for_syndication;
        this.media_metadata = media_metadata;
    }
}
