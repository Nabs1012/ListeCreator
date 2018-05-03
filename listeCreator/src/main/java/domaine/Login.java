package domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idLogin;
	private String login;
	private String motDePasse;
	
	//Constructeur
	public Login(Integer idLogin, String login, String motDePasse) {
		super();
		this.idLogin = idLogin;
		this.login = login;
		this.motDePasse = motDePasse;
	}
	public Login(String login, String motDePasse) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
	}
	public Login() {
		super();
	}
	
	public Login(Integer idLogin, String login) {
		super();
		this.idLogin = idLogin;
		this.login = login;
	}
	//getteur-setter
	public Integer getIdLogin() {
		return idLogin;
	}
	public void setIdLogin(Integer idLogin) {
		this.idLogin = idLogin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
}
