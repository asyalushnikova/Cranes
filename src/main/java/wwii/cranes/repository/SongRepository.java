package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.song.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long> {
}
