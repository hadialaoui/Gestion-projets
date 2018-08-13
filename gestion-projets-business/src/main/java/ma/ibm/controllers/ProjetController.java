package ma.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	private ProjetRepository repository;
	@Autowired
	private IEntityToModel toModel;
	
	@GetMapping(value="/listProjets")
	public List<Projet> newEmployee() {
		return toModel.listProjetsEntityToModel(repository.findAll());
	}
	
	

}
