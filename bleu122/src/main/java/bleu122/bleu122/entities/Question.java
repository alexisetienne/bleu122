package bleu122.bleu122.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question implements Serializable {
	@Id
	private Long IdQuestion;
	private String Question;
	@ManyToOne
	@JoinColumn(name="IdTheme")
	private Theme theme;
	@OneToMany(mappedBy="question",fetch=FetchType.LAZY)
	private List<Notes> notes;
	
 public Question() {
	 super();
 }
	
	
	public Question(Long IdQuestion, String Question, String Theme) {
		this.IdQuestion = IdQuestion;
		this.Question = Question;
		this.theme = theme;
		
	}


	public Long getIdQuestion() {
		return IdQuestion;
	}


	public void setIdQuestion(Long idQuestion) {
		IdQuestion = idQuestion;
	}


	public String getQuestion() {
		return Question;
	}


	public void setQuestion(String question) {
		Question = question;
	}


	public Theme getTheme() {
		return theme;
	}


	public void setTheme(Theme theme) {
		this.theme = theme;
	}


	public List<Notes> getNotes() {
		return notes;
	}


	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}


	@Override
	public String toString() {
		return "Question [IdQuestion=" + IdQuestion + ", Question=" + Question + ", theme=" + theme + ", notes=" + notes
				+ "]";
	}

	
}
