package maven.onlinelibrary.repository;

import maven.onlinelibrary.entities.Author;
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

}


