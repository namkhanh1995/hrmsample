package training.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import training.hrm.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long>{

	@Query("SELECT u FROM Vote u WHERE u.id_vote = ?1")
	Vote findTheme(int id_vote);

}
