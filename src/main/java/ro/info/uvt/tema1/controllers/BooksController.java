package ro.info.uvt.tema1.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.info.uvt.tema1.Book;
import ro.info.uvt.tema1.persistence.CrudRepository;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private final CrudRepository<Book, Long> booksRepository;

    public BooksController(CrudRepository<Book, Long> booksRepository) {
        this.booksRepository = booksRepository;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return booksRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return booksRepository.save(book);
    }
}