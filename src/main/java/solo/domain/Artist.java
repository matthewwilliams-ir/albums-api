package solo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthew Williams
 */
@NoArgsConstructor
@Getter
public class Artist {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();

    public Artist(String name){
        this.name = name;
    }
}
