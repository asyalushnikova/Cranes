package wwii.cranes.service.movie;

import wwii.cranes.model.movie.Movie;

import java.util.Optional;

public interface MovieService {

    Iterable<Movie> findAllMovies();
    Optional<Movie> findMovieById(Long movie_id);

}
