package service;

import org.springframework.stereotype.Component;

import domaine.Tache;
import repository.UtilisateurRepository;


public interface IService  {

	 Tache tachecreat( Tache tache);
	 void tachesup(Integer id);
}
