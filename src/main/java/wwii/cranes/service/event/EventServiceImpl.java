package wwii.cranes.service.event;

import org.springframework.stereotype.Service;
import wwii.cranes.model.event.Event;
import wwii.cranes.repository.EventRepository;

import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Iterable<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Optional<Event> findEventById(Long event_id) {
        return eventRepository.findById(event_id);
    }

}
