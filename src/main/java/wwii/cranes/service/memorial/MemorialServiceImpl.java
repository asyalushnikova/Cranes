package wwii.cranes.service.memorial;

import org.springframework.stereotype.Service;
import wwii.cranes.model.memorial.Memorial;
import wwii.cranes.repository.MemorialRepository;

import java.util.Optional;

@Service
public class MemorialServiceImpl implements MemorialService {

    private final MemorialRepository memorialRepository;

    public MemorialServiceImpl(MemorialRepository memorialRepository) {
        this.memorialRepository = memorialRepository;
    }

    @Override
    public Iterable<Memorial> findAllMemorials() {
        return memorialRepository.findAll();
    }

    @Override
    public Optional<Memorial> findMemorialById(Long memorial_id) {
        return memorialRepository.findById(memorial_id);
    }

}
