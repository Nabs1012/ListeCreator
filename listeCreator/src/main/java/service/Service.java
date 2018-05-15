package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import domaine.Tache;
import repository.UtilisateurRepository;

@Component
public class Service implements IService {
	
	@Autowired
	private UtilisateurRepository urepo;
	
	public Tache tachecreat( Tache tache) {
		this.urepo.save(tache);

		return tache;
	}

public void tachesup(Integer id) {
	this.urepo.deleteById(id);
}
}
