package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import domaine.Tache;
import domaine.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Tache, Integer> {

}
