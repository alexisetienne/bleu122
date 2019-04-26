package bleu122.bleu122.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Theme implements Serializable {
	@Id 
	@GeneratedValue
	private int IdTheme;
	private String Theme;
	@OneToMany(mappedBy="theme",fetch=FetchType.LAZY)
	private Collection<Question> questions;
	
	public Theme() {
		super();
	}
	
	public Theme( int IdTheme,String Theme    ) {
		this.IdTheme = IdTheme;
		this.Theme = Theme;
		
	}

	public int getIdTheme() {
		return IdTheme;
	}

	public void setIdTheme(int idTheme) {
		IdTheme = idTheme;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	@Override
	public String toString() {
		return "Theme [IdTheme=" + IdTheme + ", Theme=" + Theme + "]";
	}
	
	

}
