package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.hero.Hero;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Long> {
}
