package wwii.cranes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wwii.cranes.model.book.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
