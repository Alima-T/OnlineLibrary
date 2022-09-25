package maven.onlinelibrary.repository;

import maven.onlinelibrary.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Alima-T 9/25/2022
 */

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
