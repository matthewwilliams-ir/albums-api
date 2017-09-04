package solo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Matthew Williams
 */
@NoArgsConstructor
@Getter
public class Album {

    @Id
    @GeneratedValue
    private Long id;

    @JsonIgnore
    @ManyToOne
    private Artist artist;

    @OneToMany(mappedBy = "album")
    private List<Song> songs = new ArrayList<>();

    private String title;
    //private Date releaseDate;
    private int confirmed;
    private int total;

    public Album(Artist artist, String title, int confirmed, int total){
        this.artist = artist;
        this.title = title;
        this.confirmed = confirmed;
        this.total = total;
    }
}
