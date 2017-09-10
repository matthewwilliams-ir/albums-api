package solo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solo.domain.Album;

import java.util.Collection;

/**
 * @author Matthew Williams
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {

    Collection<Album> findByArtistName(String name);
}
