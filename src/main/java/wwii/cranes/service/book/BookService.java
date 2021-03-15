package wwii.cranes.service.book;

import wwii.cranes.model.book.Book;

import java.util.Optional;

public interface BookService {

    Iterable<Book> findAllBooks();
    Optional<Book> findBookById(Long book_id);

}
