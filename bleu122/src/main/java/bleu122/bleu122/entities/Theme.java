package bleu122.bleu122.entities;

public class Theme {
	private String Theme;
	private int IdQuestion;
	
	public Theme(String Theme, int IdQuestion) {
		this.Theme = Theme;
		this.IdQuestion = IdQuestion;
		
		
	}

	@Override
	public String toString() {
		return "Themes [Theme=" + Theme + ", IdQuestion=" + IdQuestion + "]";
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public int getIdQuestion() {
		return IdQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		IdQuestion = idQuestion;
	}

}
