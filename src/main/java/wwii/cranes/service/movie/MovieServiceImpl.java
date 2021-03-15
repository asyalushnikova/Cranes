package wwii.cranes.service.movie;

import org.springframework.stereotype.Service;
import wwii.cranes.model.movie.Movie;
import wwii.cranes.repository.MovieRepository;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Iterable<Movie> findAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findMovieById(Long movie_id) {
        return movieRepository.findById(movie_id);
    }

}
