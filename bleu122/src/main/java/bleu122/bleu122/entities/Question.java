package bleu122.bleu122.entities;

public class Question {
	private int IdQuestion;
	private String Question;
	private String Theme;
	
	public Question(int IdQuestion, String Question, String Theme) {
		this.IdQuestion = IdQuestion;
		this.Question = Question;
		this.Theme = Theme;
		
		
	}

	@Override
	public String toString() {
		return "Question [IdQuestion=" + IdQuestion + ", Question=" + Question + ", Theme=" + Theme + "]";
	}

	public int getIdQuestion() {
		return IdQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		IdQuestion = idQuestion;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}
	

	
}
