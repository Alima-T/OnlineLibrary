package maven.onlinelibrary.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Alima-T 9/18/2022
 */
public interface BasicDAO<T> {
        // получение всех записей (без постраничности)
        List<T> getAll();

        // поиск записей с любым количествомм параметров
        List<T> search (String...searchString);

        // получение объекта по id
        T get (Long id);

        // save - обновляет или добавляет объект (один метод на 2 действия)
        T save (int id, T obj);

        void delete (T obj);

}
