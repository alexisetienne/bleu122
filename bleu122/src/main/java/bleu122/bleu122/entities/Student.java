package bleu122.bleu122.entities;
import java.io.Serializable;
import java.util.Collection;
//import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


public class Student {
	
	private int IdStudent;
	private String Login;
	private String Password;
	
	
	public Student() {
		super();
	}
		
	public Student(int IdStudent, String Login, String Password) {
		this.IdStudent = IdStudent;
		this.Login = Login;
		this.Password = Password;
	}

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
