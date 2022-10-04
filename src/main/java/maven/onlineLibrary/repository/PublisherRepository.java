package maven.onlineLibrary.repository;

import maven.onlineLibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Alima-T 9/25/2022
 */

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
