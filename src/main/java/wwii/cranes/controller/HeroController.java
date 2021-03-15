package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.hero.Hero;
import wwii.cranes.service.hero.HeroService;

@Controller
@RequestMapping("/cranes")
public class HeroController {

    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @RequestMapping("/we_remember")
    String mainIndex() {
        return "we_remember/index";
    }

    @RequestMapping("/we_remember/war_in_100_images")
    String listWarInImages() {
        return "we_remember/war_in_100_images/index";
    }

    @RequestMapping("/we_remember/commanders")
    String listCommanders(Model model) {
        model.addAttribute("commanders", heroService.findAllHeros());
        return "we_remember/commanders/index";
    }

    @RequestMapping("/we_remember/commanders/view/{id}")
    public String viewCommander(@PathVariable Long id, Model model) {
        Hero hero = heroService.findHeroById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("commander", hero);
        return "we_remember/commanders/view";
    }

    @RequestMapping("/we_remember/legends")
    String listLegends(Model model) {
        model.addAttribute("legends", heroService.findAllHeros());
        return "we_remember/legends/index";
    }

    @RequestMapping("/we_remember/women_at_war")
    String listWomenAtWar(Model model) {
        model.addAttribute("women_at_war", heroService.findAllHeros());
        return "we_remember/women_at_war/index";
    }

}
