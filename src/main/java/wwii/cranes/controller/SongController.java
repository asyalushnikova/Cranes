package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.song.Song;
import wwii.cranes.service.song.SongService;

@Controller
@RequestMapping("/cranes")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping("/military_songs")
    public String listMilitarySongs(Model model) {
        model.addAttribute("military_songs", songService.findAllSongs());
        return "military_songs/index";
    }

    @RequestMapping("/military_songs/view/{id}")
    public String viewMilitarySongs(@PathVariable Long id, Model model) {
        Song song = songService.findSongById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("military_songs", song);
        return "military_songs/view";
    }

}
