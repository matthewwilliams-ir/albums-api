package solo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import solo.domain.Song;

/**
 * @author Matthew Williams
 */
@RestResource(path = "song", rel = "song")
public interface SongRepository extends JpaRepository<Song, Long>{


}
