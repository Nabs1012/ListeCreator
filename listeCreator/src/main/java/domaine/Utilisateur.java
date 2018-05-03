package domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idUrilisateur;
	private String nom;
	private String prenom;
	
	//Constructeur
	public Utilisateur(Integer idUrilisateur, String nom, String prenom) {
		super();
		this.idUrilisateur = idUrilisateur;
		this.nom = nom;
		this.prenom = prenom;
	}
	public Utilisateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Utilisateur() {
		super();
	}
	//getter-setter
	public Integer getIdUrilisateur() {
		return idUrilisateur;
	}
	public void setIdUrilisateur(Integer idUrilisateur) {
		this.idUrilisateur = idUrilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
}
