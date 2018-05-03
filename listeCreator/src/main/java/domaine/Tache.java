package domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tache {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTache;
	private String titre;
	private String priorite;
	private String tache;
	
	//Constructeur
	public Tache(Integer
			idTache, String titre, String priorite, String tache) {
		super();
		this.idTache = idTache;
		this.titre = titre;
		this.priorite = priorite;
		this.tache = tache;
	}

	public Tache(String titre, String priorite, String tache) {
		super();
		this.titre = titre;
		this.priorite = priorite;
		this.tache = tache;
	}

	public Tache() {
		super();
	}
	
	//getter-setter
	public Integer getIdTache() {
		return idTache;
	}
	public void setIdTache(Integer idTache) {
		this.idTache = idTache;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	public String getTache() {
		return tache;
	}
	public void setTache(String tache) {
		this.tache = tache;
	}
	
	
}
