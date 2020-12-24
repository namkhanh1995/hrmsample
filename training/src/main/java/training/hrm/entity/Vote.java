package training.hrm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vote")
public class Vote {
	@Id
	private int id_vote;
	private String theme_vote;
	public int getId_vote() {
		return id_vote;
	}
	public void setId_vote(int id_vote) {
		this.id_vote = id_vote;
	}
	public String getTheme_vote() {
		return theme_vote;
	}
	public void setTheme_vote(String theme_vote) {
		this.theme_vote = theme_vote;
	}
	public Vote(int id_vote, String theme_vote) {
		super();
		this.id_vote = id_vote;
		this.theme_vote = theme_vote;
	}
	public Vote() {
		super();
	}
	
}
