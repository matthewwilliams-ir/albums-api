package solo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Matthew Williams
 */
@NoArgsConstructor
@Getter
@Entity
@Table(name = "artist")
public class Artist {

    @OneToMany(mappedBy = "artist")
    private List<Album> albums = new ArrayList<>();

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Artist(String name){
        this.name = name;
    }
}
