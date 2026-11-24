package ro.info.uvt.tema1.controllers;

import org.springframework.web.bind.annotation.*;
import ro.info.uvt.tema1.Book;
import ro.info.uvt.tema1.observer.AllBooksSubject;
import ro.info.uvt.tema1.persistence.BooksRepository;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BooksRepository booksRepository;
    private final AllBooksSubject allBooksSubject;

    public BooksController(BooksRepository booksRepository, AllBooksSubject allBooksSubject) {
        this.booksRepository = booksRepository;
        this.allBooksSubject = allBooksSubject;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return booksRepository.findById(id).orElse(null);
    }

    @PostMapping
    public String newBook(@RequestBody Book book) {
        book = booksRepository.save(book);
        allBooksSubject.add(book);
        return "Book saved [" + book.getId() + "] " + book.getTitle();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book updatedBook) {
        return booksRepository.findById(id)
                .map(book -> {
                    book.setTitle(updatedBook.getTitle());
                    return booksRepository.save(book);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id) {
        booksRepository.deleteById(id);
    }
}