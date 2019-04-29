package bleu122.bleu122.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Notes implements Serializable{
	@Id
	@GeneratedValue
	private Long IdNote;
	private double Note;
	@ManyToOne
	@JoinColumn(name="IdStudent")
	private Student student ;
	@ManyToOne
	@JoinColumn(name="IdQuestion")
	private Question question;
	
	public Notes() {
		super();
	}
	
	public Notes(Long IdNote,double Note, Student student, Question question) {
    	this.IdNote = IdNote;
    	this.Note = Note;
    	this.student = student;
    	this.question = question;
   }


	public Long getIdNote() {
		return IdNote;
	}


	public void setIdNote(Long idNote) {
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
