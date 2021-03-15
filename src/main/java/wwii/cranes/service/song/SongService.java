package wwii.cranes.service.song;

import wwii.cranes.model.song.Song;

import java.util.Optional;

public interface SongService {

    Iterable<Song> findAllSongs();
    Optional<Song> findSongById(Long song_id);

}
