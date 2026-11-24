package ro.info.uvt.tema1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.info.uvt.tema1.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {
}