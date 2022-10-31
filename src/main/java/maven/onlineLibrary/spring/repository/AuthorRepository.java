package maven.onlineLibrary.spring.repository;

import maven.onlineLibrary.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Alima-T 9/24/2022
 */
// создается специальный Spring bean, выполняет запросы в БД
// JpaRepository extends PagingAndSortingRepository (extends CrudRepository) -содержит CRUD функционал + постраничность

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

    // на основании имени метода будет построен Hibernate запрос
    List<Author> findAllByAuthorFullNameContainingIgnoreCaseOrderByAuthorFullName(String name);
}
