package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.memorial.Memorial;

@Repository
public interface MemorialRepository extends CrudRepository<Memorial, Long> {
}
