package solo;

import org.joda.time.DateTime;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import solo.domain.Album;
import solo.domain.Artist;
import solo.domain.Song;
import solo.repository.AlbumRepository;
import solo.repository.ArtistRepository;
import solo.repository.SongRepository;

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
    CommandLineRunner init(AlbumRepository albumRepository, ArtistRepository artistRepository, SongRepository songRepository){

        Artist artist = artistRepository.save(new Artist("Buddy"));
        Album album = albumRepository.save(new Album(artist, "Magnolia", new DateTime(2017, 8, 25, 0, 0).toDate(), 5, 5));
        songRepository.save(new Song(album, 1, "Buddy", "4 The Record", "Boogie", "Mike & Keys", true));
        songRepository.save(new Song(album, 2, "Buddy", "Who Shot 2 Tall", null, "Mike & Keys", true));
        songRepository.save(new Song(album, 3, "Buddy", "Type Of Shit", "Wiz Khalifa", "Mike & Keys", true));
        songRepository.save(new Song(album, 4, "Buddy", "Last Time", "Kent Jamz", "Mike & Keys", true));
        songRepository.save(new Song(album, 5, "Buddy", "That Much", null, "Mike & Keys", true));
        return (evt) -> Arrays.asList(album);
    }
}
