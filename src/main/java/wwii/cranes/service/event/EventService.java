package wwii.cranes.service.event;

import wwii.cranes.model.event.Event;

import java.util.Optional;

public interface EventService {

    Iterable<Event> findAllEvents();
    Optional<Event> findEventById(Long event_id);

}
