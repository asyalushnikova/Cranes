package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.event.Event;
import wwii.cranes.service.event.EventService;

@Controller
@RequestMapping("/cranes")
public class EventController {

    private final EventService eventService;

    @Autowired
    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @RequestMapping("/war_chronology")
    public String listWarChronology(Model model) {
        model.addAttribute("war_chronology", eventService.findAllEvents());
        return "war_chronology/index";
    }

    @RequestMapping("/war_chronology/view/{id}")
    public String viewWarChronology(@PathVariable Long id, Model model) {
        Event event = eventService.findEventById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("war_chronology", event);
        return "war_chronology/view";
    }

}
