package bleu122.bleu122.entities;

public class Etudiant {
	
	private int IdStudent;
	private String Login;
	private String Password;
	
	
	public Etudiant(int IdStudent, String Login, String Password) {
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
