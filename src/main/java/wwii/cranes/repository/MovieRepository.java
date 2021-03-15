package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.movie.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
