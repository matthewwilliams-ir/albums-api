package solo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import solo.domain.Artist;

import java.util.Optional;

/**
 * @author Matthew Williams
 */
@RestResource(path = "artist", rel = "artist")
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    Optional<Artist> findByName(String name);
}
