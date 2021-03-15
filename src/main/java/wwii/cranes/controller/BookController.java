package wwii.cranes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import wwii.cranes.model.book.Book;
import wwii.cranes.service.book.BookService;

@Controller
@RequestMapping("/cranes")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books_about_war")
    public String listBooksAboutWar(Model model) {
        model.addAttribute("books_about_war", bookService.findAllBooks());
        return "books_about_war/index";
    }

    @RequestMapping("/books_about_war/view/{id}")
    public String viewBookAboutWar(@PathVariable Long id, Model model) {
        Book book = bookService.findBookById(id)
                .orElseThrow(()
                        -> new IllegalArgumentException(
                        "Invalid id: " + id));
        model.addAttribute("books_about_war", book);
        return "books_about_war/view";
    }

}
