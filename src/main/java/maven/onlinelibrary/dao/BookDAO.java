package maven.onlineLibrary.dao;

import maven.onlineLibrary.entity.Book;

import java.util.List;

/**
 * @Alima-T 9/24/2022
 */
public interface BookDAO extends BasicDAO<Book>{

    List<Book> getTopBooks (int limit);
}
