package maven.onlinelibrary.dao;

import maven.onlinelibrary.entities.Author;

import java.util.ArrayList;
import java.util.List;

/**
 * @Alima-T 9/18/2022
 */
public interface AuthorDAO extends BasicDAO<Author> {

    List<Author> listResult = new ArrayList<>();

    default List<Author> getAll(){return listResult;}

    default void create(int id, Author author){listResult.add(author);}

    default Author get(Long id){return listResult.get(Math.toIntExact(id));}

    public default void delete(Author author){listResult.remove(author);}
}
