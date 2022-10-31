package maven.onlineLibrary.spring.repository;

import maven.onlineLibrary.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Alima-T 9/25/2022
 */

@Repository
public interface GenreRepository extends JpaRepository<Genre,Long> {

    List<Genre> findAllByGenreNameContainingIgnoreCaseOrderByGenreName(String name);

}
