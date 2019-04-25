package bleu122.bleu122.entities;

public class Notes {
	
	private int IdNotes;
	private int IdStudent;
	private int IdQuestion;
	private double Note;
	
    public Notes(int IdNotes, int IdStudent, int IdQuestion, double Note) {
    	this.IdNotes = IdNotes;
    	this.IdStudent = IdStudent;
    	this.IdQuestion = IdQuestion;
    	this.Note = Note;
    	
    	 	
    }

	@Override
	public String toString() {
		return "Notes [IdNotes=" + IdNotes + ", IdStudent=" + IdStudent + ", IdQuestion=" + IdQuestion + ", Note="
				+ Note + "]";
	}

	public int getIdNotes() {
		return IdNotes;
	}

	public void setIdNotes(int idNotes) {
		IdNotes = idNotes;
	}

	public int getIdStudent() {
		return IdStudent;
	}

	public void setIdStudent(int idStudent) {
		IdStudent = idStudent;
	}

	public int getIdQuestion() {
		return IdQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		IdQuestion = idQuestion;
	}

	public double getNote() {
		return Note;
	}

	public void setNote(int note) {
		Note = note;
	}

}
