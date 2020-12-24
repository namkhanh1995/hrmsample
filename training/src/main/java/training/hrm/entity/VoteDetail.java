package training.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vote_detail")
public class VoteDetail {
	
	@Id
	private int id_vote_detail;
	
	private int id_vote;
	
	private String answer;
	
	public int getId_vote() {
		return id_vote;
	}
	public void setId_vote(int id_vote) {
		this.id_vote = id_vote;
	}
	public int getId_vote_detail() {
		return id_vote_detail;
	}
	public void setId_vote_detail(int id_vote_detail) {
		this.id_vote_detail = id_vote_detail;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public VoteDetail() {
		super();
	}
	public VoteDetail(int id_vote, int id_vote_detail, String answer) {
		super();
		this.id_vote = id_vote;
		this.id_vote_detail = id_vote_detail;
		this.answer = answer;
	}
}
