package wwii.cranes.service.herocity;

import wwii.cranes.model.herocity.HeroCity;

import java.util.Optional;

public interface HeroCityService {

    Iterable<HeroCity> findAllHeroCities();
    Optional<HeroCity> findHeroCityById(Long hero_city_id);

}
