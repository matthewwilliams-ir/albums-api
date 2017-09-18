package solo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import solo.domain.Album;
import solo.repository.AlbumRepository;
import solo.repository.ArtistRepository;
import solo.repository.SongRepository;

import java.util.Collection;

/**
 * @author Matthew Williams
 */
@RestController
@RequestMapping("/search")
public class AlbumRestController {

    private final AlbumRepository albumRepository;
    private final ArtistRepository artistRepository;
    private SongRepository songRepository;

    @Autowired
    AlbumRestController(AlbumRepository albumRepository, ArtistRepository artistRepository, SongRepository songRepository){
        this.albumRepository = albumRepository;
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }

    @GetMapping()
    public Collection<Album> findAlbumByArtist(@RequestParam("artist") String artist){
        return albumRepository.findByArtistName(artist);
    }

//    @GetMapping()
//    public Collection<Album> readAlbums(){
//        return albumRepository.findAll();
//    }
//
//    @GetMapping(value = "/{albumId}")
//    public Album readAlbum(@PathVariable Long albumId){
//        return albumRepository.findOne(albumId);
//    }
//
//    @GetMapping(value = "/{albumId}/songs")
//    public Collection<Song> readAlbumSongs(@PathVariable Long albumId){
//        return albumRepository.findOne(albumId).getSongs();
//    }
//
//    private void validateAlbum(Long albumId){
//    }
}
