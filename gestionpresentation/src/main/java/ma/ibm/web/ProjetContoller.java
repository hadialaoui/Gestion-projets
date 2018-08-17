package ma.ibm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import ma.ibm.models.Projet;
import ma.ibm.services.IProjetService;

@Controller
public class ProjetContoller {

	@Autowired
	private IProjetService projetService;
	
	@GetMapping(value="/projets")
	public String getView(Model model) {
		model.addAttribute("projets",projetService.getProjets());
		return "projets";
	}
	
	@GetMapping(value="/newProjet")
	private String newProjet(Model model){
		model.addAttribute("projet", new Projet());
	 return "ajouterProjet";
	}
	
	@GetMapping(value="/updateProjet/{id}")
	private String updateProjet(@PathVariable Long id,Model model){
		Projet e = projetService.getProjet(id);
		model.addAttribute("projet", e);
	 return "editProjet";
	}
	
	@GetMapping(value="/projets/{id}")
	private String getProjet(@PathVariable Long id,Model model){
		model.addAttribute("projet",projetService.getProjet(id));
		return "index";
	}
	
	@PostMapping(value="/projets")
	private String save(@ModelAttribute  Projet e, Model model){
		model.addAttribute("projet",projetService.saveProjet(e));
		return "confirmationProjet";
	}
	
	@GetMapping(value="/projets/delete/{id}")
	private String delete(@PathVariable Long id, Model model){
		
		boolean test = projetService.deleteProjet(id);
		model.addAttribute("deleted",test);
		model.addAttribute("projets",projetService.getProjets());
		System.out.println(test);
	 return "projets";
	}
	
	@GetMapping(value="/projets/{id}/employees/")
	private String projetsEmp(@PathVariable Long id, Model model){
		//model.addAttribute("deleted",projetService.deleteProjet(id));
		boolean test = projetService.deleteProjet(id);
		model.addAttribute("projets",projetService.getProjets());
		System.out.println(test);
	 return "index";
	}
	
	@GetMapping(value="/projets/{id}/employees")
	private String employeesPro(@PathVariable Long id, Model model){
		model.addAttribute("projet",projetService.getProjet(id));
		//boolean test = employeeService.deleteEmployee(id);
		System.out.println(id+" EmployeeController avant");
		model.addAttribute("employees",projetService.getProjetEmployeesByProId(id));
		System.out.println(id+" EmployeeController apres");
	 return "employeesProjet";
	}
	
	@PostMapping(value="/projets/put/{id}")
	private String update(@PathVariable Long id, @ModelAttribute Projet p,Model model){
		model.addAttribute("projet",projetService.updateProjet(id, p));
		model.addAttribute("projets",projetService.getProjets());
		model.addAttribute("validPut","yes");
		return "confirmationProjet";
	}
	
}
