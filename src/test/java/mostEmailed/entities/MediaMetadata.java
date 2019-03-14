package mostEmailed.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class MediaMetadata {

    @JsonProperty("url")
    private String url;
    @JsonProperty("format")
    private String format;
    @JsonProperty("height")
    private int height;
    @JsonProperty("width")
    private int width;

    public MediaMetadata() {}

    public MediaMetadata(String url, String format, int height, int width) {
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
    }
}
