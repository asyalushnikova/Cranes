package wwii.cranes.service.hero;

import wwii.cranes.model.hero.Hero;

import java.util.Optional;

public interface HeroService {

    Iterable<Hero> findAllHeros();
    Optional<Hero> findHeroById(Long hero_id);

}
