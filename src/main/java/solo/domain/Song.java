package solo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Matthew Williams
 */
@NoArgsConstructor
@Getter
@Entity
@Table(name = "song")
public class Song {

    @ManyToOne
    @JoinColumn(name = "album_id")
    private Album album;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "track_no")
    private int trackNo;

    @Column(name = "primary_artist")
    private String primaryArtist;

    @Column(name = "title")
    private String title;

    @Column(name = "features")
    private String features;

    @Column(name = "producers")
    private String producers;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;

    public Song(Album album, int trackNo, String primaryArtist, String title, String features, String producers, boolean isConfirmed){
        this.album = album;
        this.trackNo = trackNo;
        this.primaryArtist = primaryArtist;
        this.title = title;
        this.features = features;
        this.producers = producers;
        this.isConfirmed = isConfirmed;
    }
}
