package training.hrm.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import training.hrm.entity.Vote;
import training.hrm.entity.VoteDetail;
import training.hrm.repository.VoteDetailRepository;
import training.hrm.repository.VoteRepository;

@CrossOrigin(origins="http://localhost:4200")  
@RestController
public class VoteAPI {
	@Autowired
	private VoteRepository voteRepository;
	
	@Autowired
	private VoteDetailRepository voteDetailRepository;
	
	@GetMapping("/api/vote")
    public List<Vote> getAllVote() {
        return voteRepository.findAll();
    }
	
	@GetMapping("/api/vote/{id_vote}")
    public Vote getTheme(@PathVariable("id_vote") int id_vote) {
        return voteRepository.findTheme(id_vote);
    }
	
	@GetMapping("/api/vote-detail/{id_vote}")
    public List<VoteDetail> getAllVoteDetail(@PathVariable("id_vote") int id_vote) {
        return voteDetailRepository.findAllDetail(id_vote);
    }
	
	
}
