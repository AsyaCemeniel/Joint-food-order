package foodproject.as.orl.jointfoodorder.repository;

import foodproject.as.orl.jointfoodorder.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteRepository extends JpaRepository<Vote, Integer> {
}
