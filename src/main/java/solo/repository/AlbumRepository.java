package solo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import solo.domain.Album;
import solo.domain.Artist;

import java.util.Collection;
import java.util.Optional;

/**
 * @author Matthew Williams
 */
public interface AlbumRepository extends JpaRepository<Album, Long> {

    Collection<Album> findByArtistName(String name);
}
