package training.hrm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import training.hrm.entity.VoteDetail;

public interface VoteDetailRepository extends JpaRepository<VoteDetail, Long>{

	@Query("SELECT u FROM VoteDetail u WHERE u.id_vote = ?1")
	List<VoteDetail> findAllDetail(int id_vote);

}
