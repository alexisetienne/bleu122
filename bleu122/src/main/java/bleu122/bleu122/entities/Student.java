package bleu122.bleu122.entities;

<<<<<<< HEAD
public class Student {
	
	private int IdStudent;
	private String Login;
	private String Password;
	
	
	public Student(int IdStudent, String Login, String Password) {
		this.IdStudent = IdStudent;
		this.Login = Login;
		this.Password = Password;
	}

=======
import java.io.Serializable;
import java.util.Collection;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student implements Serializable {
	@Id @GeneratedValue
	private int IdStudent;
	private String Login;
	private String Password;
	@OneToMany(mappedBy="note",fetch=FetchType.LAZY)
	private Collection<Notes> notes;
//	private List<Notes> notes;
	
	public Student() {
		super();
	}
		
	public Student(int IdStudent, String Login, String Password) {
		this.IdStudent = IdStudent;
		this.Login = Login;
		this.Password = Password;
	}
>>>>>>> branch 'master' of https://github.com/alexisetienne/bleu122.git

	@Override
	public String toString() {
		return "Etudiant [IdStudent=" + IdStudent  + ", Login=" + Login + ", Password=" + Password + "]";
	}


	public int getIdStudent() {
		return IdStudent;
	}


	public void setIdStudent(int idStudent) {
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

}
