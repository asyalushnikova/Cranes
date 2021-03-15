package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.herocity.HeroCity;

@Repository
public interface HeroCityRepository extends CrudRepository<HeroCity, Long> {
}
