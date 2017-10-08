package solo.controller;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import solo.Application;
import solo.domain.Album;
import solo.domain.Artist;
import solo.domain.Song;
import solo.repository.AlbumRepository;
import solo.repository.ArtistRepository;
import solo.repository.SongRepository;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * @author Matthew Williams
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class AlbumRestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ArtistRepository artistRepository;

    @Autowired
    private SongRepository songRepository;

    private Album album;

    private Artist artist;

    private List<Song> songList = new ArrayList<>();

    @Before
    public void setup() throws Exception {

        mockMvc = webAppContextSetup(webApplicationContext).build();

        //albumRepository.deleteAllInBatch();
        //artistRepository.deleteAllInBatch();
        //songRepository.deleteAllInBatch();

        artist = artistRepository.save(new Artist("Buddy"));
        album = albumRepository.save(new Album(artist, "Magnolia", new DateTime(2017, 8, 25, 0, 0).toDate(), 5, 5));
        songList.add(songRepository.save(new Song(album, 1, "Buddy", "4 The Record", "Boogie", "Mike & Keys", true)));
        songList.add(songRepository.save(new Song(album, 2, "Buddy", "Who Shot 2 Tall", null, "Mike & Keys", true)));
        songList.add(songRepository.save(new Song(album, 3, "Buddy", "Type Of Shit", "Wiz Khalifa", "Mike & Keys", true)));
        songList.add(songRepository.save(new Song(album, 4, "Buddy", "Last Time", "Kent Jamz", "Mike & Keys", true)));
        songList.add(songRepository.save(new Song(album, 5, "Buddy", "That Much", null, "Mike & Keys", true)));
    }

    @Test
    public void readSingleAlbum() throws Exception{

        mockMvc.perform(get("/album/" + album.getId()))
                .andExpect(status().isOk());
    }

    @Test
    public void readSingleAlbum_notFound() throws Exception{

        mockMvc.perform(get("/album/" + 5))
                .andExpect(status().isNotFound());
    }

    @Test
    public void readAlbums() throws Exception{

        mockMvc.perform(get("/album"))
                .andExpect(status().isOk());
    }

}