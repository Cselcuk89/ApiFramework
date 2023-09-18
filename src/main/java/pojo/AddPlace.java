package pojo;

import lombok.*;

import javax.xml.stream.Location;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddPlace {
    private int accuracy;
    private String name;
    private String phoneNumber;
    private String address;
    private String website;
    private String language;
    private Location location;
    private List<String> types;
}
