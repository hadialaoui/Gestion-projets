package ma.ibm.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.ibm.models.Projet;
import ma.ibm.repositories.ProjetRepository;
import ma.ibm.services.IEntityToModel;

@CrossOrigin("*")
@RestController
@RequestMapping("/gestion-projets")
public class ProjetController {
	@Autowired
	private ProjetRepository projetRepository;
	@Autowired
	private IEntityToModel toModel;
	
	@GetMapping(value="/projets")
	public List<Projet> newProjet() {
		return toModel.listProjetsEntityToModel(projetRepository.findAll());
	}
	
	@GetMapping(value="/projets/{id}")
	private Projet getContact(@PathVariable Long id){
		Optional<ma.ibm.entities.Projet> e = projetRepository.findById(id);
		return toModel.proEntityToModel(e.get());
	}
	
	@PostMapping(value="/projets")
	private Projet save(@RequestBody ma.ibm.entities.Projet e){
		return toModel.proEntityToModel(projetRepository.save(e));
	}
	
	@DeleteMapping(value="/projets/{id}")
	private boolean delete(@PathVariable Long id){
		projetRepository.deleteById(id);
	 return true;
	}
	@PutMapping(value="/projets/{id}")
	private Projet save(@PathVariable Long id, @RequestBody ma.ibm.entities.Projet e){
		e.setId(id);
		return toModel.proEntityToModel(projetRepository.save(e));
	}

	@GetMapping(value="/projets/{id}/employees")
	private List<Projet> getProjetsByEmp(@PathVariable Long id){
		Optional<ma.ibm.entities.Projet> e = projetRepository.findById(id);
		return null;
	}
}

	


