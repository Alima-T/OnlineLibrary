package maven.onlinelibrary.repository;

import maven.onlinelibrary.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Alima-T 9/24/2022
 */
// создается специальный Spring bean, выполняет запросы в БД
// JpaRepository - содержит CRUD функционал + постраничность

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

    List<Author> findAllByFioContainingIgnoreCaseOrderByFio(String fio);
}
