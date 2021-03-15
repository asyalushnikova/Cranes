package wwii.cranes.service.song;

import org.springframework.stereotype.Service;
import wwii.cranes.model.song.Song;
import wwii.cranes.repository.SongRepository;

import java.util.Optional;

@Service
public class SongServiceImpl implements SongService {

    private final SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public Iterable<Song> findAllSongs() {
        return songRepository.findAll();
    }

    @Override
    public Optional<Song> findSongById(Long song_id) {
        return songRepository.findById(song_id);
    }

}
