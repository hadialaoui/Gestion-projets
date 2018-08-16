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

import ma.ibm.models.Employee;
import ma.ibm.models.LongType;
import ma.ibm.models.Projet;
import ma.ibm.repositories.EmployeeRepository;
import ma.ibm.repositories.ProjetRepository;
import ma.ibm.services.IEntityToModel;

@CrossOrigin("*")
@RestController
@RequestMapping("/gestion-projets")
public class EmployeeController {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private ProjetRepository projetRepository;
	@Autowired
	private IEntityToModel toModel;

	@GetMapping(value="/listEmployee")
	public List<Employee> getEmployees() {		
		return toModel.listEmployeesEntityToModel(employeeRepository.findAll());
	}
	
	@GetMapping(value="/listEmployee/{id}")
	private Employee getContact(@PathVariable Long id){
		Optional<ma.ibm.entities.Employee> e = employeeRepository.findById(id);
		return toModel.empEntityToModel(e.get());
	}
	
	@PostMapping(value="/listEmployee")
	private Employee save(@RequestBody ma.ibm.entities.Employee e){
		return toModel.empEntityToModel(employeeRepository.save(e));
	}
	
	@PutMapping(value="/affectationProjet/{id}")
	private void affectationProjet(@PathVariable Long id,@RequestBody LongType number){
		Long idPro = new Long(number.getNumber());
		Optional<ma.ibm.entities.Employee> e = employeeRepository.findById(id);
		ma.ibm.entities.Employee emp=e.get();
		Optional<ma.ibm.entities.Projet> p = projetRepository.findById(idPro);
		ma.ibm.entities.Projet pro=p.get();
		emp.setId(id);
		pro.setId(idPro);
		emp.getProjets().add(pro);
		employeeRepository.save(emp);
		//return toModel.empEntityToModel(employeeRepository.save(e));
	}
	
	@DeleteMapping(value="/listEmployee/{id}")
	private boolean delete(@PathVariable Long id){
		employeeRepository.deleteById(id);
	 return true;
	}
	@PutMapping(value="/listEmployee/{id}")
	private Employee save(@PathVariable Long id, @RequestBody ma.ibm.entities.Employee e){
		e.setId(id);
		return toModel.empEntityToModel(employeeRepository.save(e));
	}

	@GetMapping(value="/employees/{id}/projets")
	private List<Projet> getProjetsByEmp(@PathVariable Long id){
	return toModel.listProjetsEntityToModel(employeeRepository.getEmployeeProjetsByEmpId(id));
	}
}
