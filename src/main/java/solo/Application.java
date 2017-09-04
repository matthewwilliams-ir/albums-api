package solo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import solo.domain.Album;
import solo.domain.Artist;
import solo.repository.AlbumRepository;
import solo.repository.ArtistRepository;

import java.util.Arrays;

/**
 * @author Matthew Williams
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(AlbumRepository albumRepository, ArtistRepository artistRepository){

        Artist artist = artistRepository.save(new Artist("Smino"));
        Album album = albumRepository.save(new Album(artist, "blkswn", 18, 18));

        return (evt) -> Arrays.asList();
    }
}
