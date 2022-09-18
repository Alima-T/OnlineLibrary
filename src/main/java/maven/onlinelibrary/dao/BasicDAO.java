package maven.onlinelibrary.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * @Alima-T 9/18/2022
 */
public interface BasicDAO<T> {

        public List<T> getAll();

        public void create (int id, T obj);

        public T get (Long id);

        public void delete (T obj);

}
