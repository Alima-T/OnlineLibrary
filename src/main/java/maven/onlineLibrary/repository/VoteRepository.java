package maven.onlineLibrary.repository;

import maven.onlineLibrary.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Alima-T 9/25/2022
 */

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long>{

}
