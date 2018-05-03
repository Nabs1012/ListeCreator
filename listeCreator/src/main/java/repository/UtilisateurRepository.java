package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import domaine.Tache;

public interface UtilisateurRepository extends JpaRepository<Tache, Integer> {

	
}
