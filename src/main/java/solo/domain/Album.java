package solo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Matthew Williams
 */
@NoArgsConstructor
@Getter
@Entity
@Table(name = "album")
public class Album {

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    @OneToMany(mappedBy = "album")
    private List<Song> songs = new ArrayList<>();

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "confirmed")
    private int confirmed;

    @Column(name = "total")
    private int total;

    public Album(Artist artist, String title, Date releaseDate, int confirmed, int total){
        this.artist = artist;
        this.title = title;
        this.releaseDate = releaseDate;
        this.confirmed = confirmed;
        this.total = total;
    }
}
