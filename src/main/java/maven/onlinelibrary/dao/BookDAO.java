package maven.onlinelibrary.dao;

import maven.onlinelibrary.entities.Book;

import java.util.List;

/**
 * @Alima-T 9/24/2022
 */
public interface BookDAO extends BasicDAO{

    List<Book> getTopBooks (int limit);
}
