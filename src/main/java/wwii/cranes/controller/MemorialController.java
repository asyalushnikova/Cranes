package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.memorial.Memorial;
import wwii.cranes.service.memorial.MemorialService;

@Controller
@RequestMapping("/cranes")
public class MemorialController {

    private final MemorialService memorialService;

    @Autowired
    public MemorialController(MemorialService memorialService) {
        this.memorialService = memorialService;
    }

    @RequestMapping("/stark_in_stone")
    public String listStarkInStone(Model model) {
        model.addAttribute("stark_in_stone", memorialService.findAllMemorials());
        return "stark_in_stone/index";
    }

    @RequestMapping("/stark_in_stone/view/{id}")
    public String viewStarkInStone(@PathVariable Long id, Model model) {
        Memorial memorial = memorialService.findMemorialById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("stark_in_stone", memorial);
        return "stark_in_stone/view";
    }

}
