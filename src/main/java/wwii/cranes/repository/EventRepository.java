package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.event.Event;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
}
