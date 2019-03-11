package mostEmailed.entities;

import lombok.*;

@Data
@NoArgsConstructor
public class MediaMetadata {

    private String url;
    private String format;
    private int height;
    private int width;

    public MediaMetadata(String url, String format, int height, int width) {
        this.url = url;
        this.format = format;
        this.height = height;
        this.width = width;
    }
}
