package maven.onlineLibrary.spring.repository;

import maven.onlineLibrary.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Alima-T 9/25/2022
 */

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    List<Publisher> findAllByPublisherNameContainingIgnoreCaseOrderByPublisherName(String name);

}
