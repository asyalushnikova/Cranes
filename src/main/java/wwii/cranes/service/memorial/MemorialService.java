package wwii.cranes.service.memorial;

import wwii.cranes.model.memorial.Memorial;

import java.util.Optional;

public interface MemorialService {

    Iterable<Memorial> findAllMemorials();
    Optional<Memorial> findMemorialById(Long memorial_id);

}
