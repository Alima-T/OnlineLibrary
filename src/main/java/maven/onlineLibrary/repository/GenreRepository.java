package maven.onlineLibrary.repository;

import maven.onlineLibrary.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Alima-T 9/25/2022
 */

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
