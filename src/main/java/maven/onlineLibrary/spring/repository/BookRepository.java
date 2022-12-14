package maven.onlineLibrary.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

/**
 * @Alima-T 9/24/2022
 */
// при получении списка книг - контент для каждой книги - пустой.
// Только когда пользователь нажимает на чтение книги - делаем запрос в БД на получение контента (по требованию)

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    // поиск книг по названию или автору
    // если имя метода получается слишком длинным - можно использовать @Query с HQL
    List<Book> findByBookNameContainingIgnoreCaseOrAuthorFullNameContainingIgnoreCaseOrderByBookName(String bookName, String authorFullName);

}


