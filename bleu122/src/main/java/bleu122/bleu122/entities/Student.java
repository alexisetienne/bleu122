package bleu122.bleu122.entities;
import java.io.Serializable;
//import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student implements Serializable {
	@Id @GeneratedValue
	private Long IdStudent;
	private String Login;
	private String Password;
	@OneToMany(mappedBy="student",fetch=FetchType.LAZY)
	private List<Notes> notes;
	
	public Student() {
		super();
	}
		
	public Student(Long IdStudent, String Login, String Password,List<Notes>notes) {
		this.IdStudent = IdStudent;
		this.Login = Login;
		this.Password = Password;
		this.notes=notes;
	}

	public Long getIdStudent() {
		return IdStudent;
	}

	public void setIdStudent(Long idStudent) {
		IdStudent = idStudent;
	}

	public String getLogin() {
		return Login;
	}

	public void setLogin(String login) {
		Login = login;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public List<Notes> getNotes() {
		return notes;
	}

	public void setNotes(List<Notes> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "Student [IdStudent=" + IdStudent + ", Login=" + Login + ", Password=" + Password + ", notes=" + notes
				+ "]";
	}

}
