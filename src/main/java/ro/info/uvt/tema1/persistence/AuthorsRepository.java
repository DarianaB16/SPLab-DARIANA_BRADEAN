package ro.info.uvt.tema1.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.info.uvt.tema1.Author;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Long> {
}
