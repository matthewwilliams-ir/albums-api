package solo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solo.domain.Song;

/**
 * @author Matthew Williams
 */
public interface SongRepository extends JpaRepository<Song, Long>{


}
