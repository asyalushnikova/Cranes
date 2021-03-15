package wwii.cranes.service.hero;

import org.springframework.stereotype.Service;
import wwii.cranes.model.hero.Hero;
import wwii.cranes.repository.HeroRepository;

import java.util.Optional;

@Service
public class HeroServiceImpl implements HeroService {

    private final HeroRepository heroRepository;

    public HeroServiceImpl(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    @Override
    public Iterable<Hero> findAllHeros() {
        return heroRepository.findAll();
    }

    @Override
    public Optional<Hero> findHeroById(Long hero_id) {
        return heroRepository.findById(hero_id);
    }

}
