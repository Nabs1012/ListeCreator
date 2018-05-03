package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import domaine.Login;
import domaine.Tache;
import repository.UtilisateurRepository;

@Controller
public class IndexController {
	
	@Autowired
	private Tache tache;

	@Autowired
	private UtilisateurRepository urepo ;
	
	@Autowired
	private Login log;
	
	@RequestMapping(path="/login")
	ModelAndView displaylogin() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@RequestMapping(path="/welcome", method= RequestMethod.GET)
	ModelAndView displayIndex() {
		ModelAndView mav = new ModelAndView("welcome");
			final List<Tache> listetache = new ArrayList<Tache>();
			listetache.add(this.tache);
			listetache.addAll(this.urepo.findAll());
			mav.getModel().put("listetache", listetache);
			return mav;
	}
	

	@RequestMapping(path="/form")
	ModelAndView displayForm () {
		ModelAndView mav = new ModelAndView("formulaire");
		
		return mav;
		
	}

	@RequestMapping(path="/form", method=RequestMethod.POST)
	ModelAndView validateForm(@RequestParam String titre, @RequestParam String priorite , @RequestParam String tache) {
		//Sauvegarder l'article en BDD.
		final Tache nouvelleTache= new Tache(titre,priorite,tache);
		this.urepo.save(nouvelleTache);
		//Revoyer sur la page de liste des articles 
		return this.displayIndex();
		

	}
	// Methode delete du crud 
	@RequestMapping(path="/deleteTache")
	ModelAndView deleteTache(@RequestParam Integer idTache ) {
		
		this.urepo.deleteById(idTache);
		return this.displayIndex();
	}
	public Tache getTache() {
		return tache;
	}

	public void setTaches(Tache tache) {
		this.tache = tache;
	}

}
