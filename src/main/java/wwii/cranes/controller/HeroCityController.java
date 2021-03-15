package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.herocity.HeroCity;
import wwii.cranes.service.herocity.HeroCityService;

@Controller
@RequestMapping("/cranes")
public class HeroCityController {

    public final HeroCityService heroCityService;

    @Autowired
    public HeroCityController(HeroCityService heroCityService) {
        this.heroCityService = heroCityService;
    }

    @RequestMapping("/risen_from_ashes")
    public String listRisenFromAshes(Model model) {
        model.addAttribute("risen_from_ashes", heroCityService.findAllHeroCities());
        return "risen_from_ashes/index";
    }

    @RequestMapping("/risen_from_ashes/view/{id}")
    public String viewRisenFromAshes(@PathVariable Long id, Model model) {
        HeroCity heroCity = heroCityService.findHeroCityById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("risen_from_ashes", heroCity);
        return "risen_from_ashes/view";
    }

}
