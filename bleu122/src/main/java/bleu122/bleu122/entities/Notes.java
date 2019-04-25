package bleu122.bleu122.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Notes implements Serializable{
	@Id
	private int IdNote;
	private double Note;
	@ManyToOne
	@JoinColumn(name="ID_STUDENT")
	private Student student ;
	@JoinColumn(name="ID_QUESTION")
	private Question question;
	
	public Notes(int IdNote,double Note, Student student, Question question) {
    	this.IdNote = IdNote;
    	this.Note = Note;
    	this.student = student;
    	this.question = question;
   }


	public int getIdNote() {
		return IdNote;
	}


	public void setIdNote(int idNote) {
		IdNote = idNote;
	}


	public double getNote() {
		return Note;
	}


	public void setNote(double note) {
		Note = note;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public Question getQuestion() {
		return question;
	}


	public void setQuestion(Question question) {
		this.question = question;
	}


	@Override
	public String toString() {
		return "Notes [IdNote=" + IdNote + ", Note=" + Note + ", student=" + student + ", question=" + question + "]";
	}

}
