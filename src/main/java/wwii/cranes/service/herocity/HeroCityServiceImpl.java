package wwii.cranes.service.herocity;

import org.springframework.stereotype.Service;
import wwii.cranes.model.herocity.HeroCity;
import wwii.cranes.repository.HeroCityRepository;

import java.util.Optional;

@Service
public class HeroCityServiceImpl implements HeroCityService {

    private final HeroCityRepository heroCityRepository;

    public HeroCityServiceImpl(HeroCityRepository heroCityRepository) {
        this.heroCityRepository = heroCityRepository;
    }

    @Override
    public Iterable<HeroCity> findAllHeroCities() {
        return heroCityRepository.findAll();
    }

    @Override
    public Optional<HeroCity> findHeroCityById(Long hero_city_id) {
        return heroCityRepository.findById(hero_city_id);
    }

}
