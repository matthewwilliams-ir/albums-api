package solo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import solo.domain.Album;

import java.util.Collection;

/**
 * @author Matthew Williams
 */
@RestResource(path = "album", rel = "album")
public interface AlbumRepository extends JpaRepository<Album, Long> {

    Collection<Album> findByArtistName(String name);
}
