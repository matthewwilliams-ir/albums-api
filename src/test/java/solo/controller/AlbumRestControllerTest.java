package solo.controller;

/**
 * @author Matthew Williams
 */
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class)
//@WebAppConfiguration
public class AlbumRestControllerTest {

//    private MockMvc mockMvc;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @Autowired
//    private AlbumRepository albumRepository;
//
//    @Autowired
//    private ArtistRepository artistRepository;
//
//    @Autowired
//    private SongRepository songRepository;
//
//    private Album album;
//
//    private Artist artist;
//
//    private List<Song> songList = new ArrayList<>();
//
//    @Before
//    public void setup() throws Exception {
//
//        mockMvc = webAppContextSetup(webApplicationContext).build();
//
//        //albumRepository.deleteAllInBatch();
//        //artistRepository.deleteAllInBatch();
//        //songRepository.deleteAllInBatch();
//
//        artist = artistRepository.save(new Artist("Buddy"));
//        album = albumRepository.save(new Album(artist, "Magnolia", new DateTime(2017, 8, 25, 0, 0).toDate(), 5, 5));
//        songList.add(songRepository.save(new Song(album, 1, "Buddy", "4 The Record", "Boogie", "Mike & Keys", true)));
//        songList.add(songRepository.save(new Song(album, 2, "Buddy", "Who Shot 2 Tall", null, "Mike & Keys", true)));
//        songList.add(songRepository.save(new Song(album, 3, "Buddy", "Type Of Shit", "Wiz Khalifa", "Mike & Keys", true)));
//        songList.add(songRepository.save(new Song(album, 4, "Buddy", "Last Time", "Kent Jamz", "Mike & Keys", true)));
//        songList.add(songRepository.save(new Song(album, 5, "Buddy", "That Much", null, "Mike & Keys", true)));
//    }
//
//    @Test
//    public void readSingleAlbum() throws Exception{
//
//        mockMvc.perform(get("/album/" + album.getId()))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    public void readSingleAlbum_notFound() throws Exception{
//
//        mockMvc.perform(get("/album/" + 5))
//                .andExpect(status().isNotFound());
//    }
//
//    @Test
//    public void readAlbums() throws Exception{
//
//        mockMvc.perform(get("/album"))
//                .andExpect(status().isOk());
//    }

}