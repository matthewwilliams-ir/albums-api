package solo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Matthew Williams
 */
@NoArgsConstructor
@Getter
public class Song {

    @JsonIgnore
    @ManyToOne
    private Album album;

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String artist;
    private String features;
    private boolean isConfirmed;
}
