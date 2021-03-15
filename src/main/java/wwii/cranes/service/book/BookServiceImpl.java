package wwii.cranes.service.book;

import org.springframework.stereotype.Service;
import wwii.cranes.model.book.Book;
import wwii.cranes.repository.BookRepository;

import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepositoty) {
        this.bookRepository = bookRepositoty;
    }

    @Override
    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findBookById(Long book_id) {
        return bookRepository.findById(book_id);
    }

}
