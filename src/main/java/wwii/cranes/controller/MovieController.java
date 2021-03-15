package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.movie.Movie;
import wwii.cranes.service.movie.MovieService;

@Controller
@RequestMapping("/cranes")
public class MovieController {

    public final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping("/movies_about_war")
    public String listMoviesAboutWar(Model model) {
        model.addAttribute("movies_about_war", movieService.findAllMovies());
        return "movies_about_war/index";
    }

    @RequestMapping("/movies_about_war/view/{id}")
    public String viewMoviesAboutWar(@PathVariable Long id, Model model) {
        Movie movie = movieService.findMovieById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("movies_about_war", movie);
        return "movies_about_war/view";
    }

}
