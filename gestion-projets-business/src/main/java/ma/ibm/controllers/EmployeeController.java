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
import ma.ibm.repositories.EmployeeRepository;
import ma.ibm.services.IEntityToModel;

@CrossOrigin("*")
@RestController
@RequestMapping("/gestion-projets")
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	@Autowired
	private IEntityToModel toModel;

	@GetMapping(value="/listEmployee")
	public List<Employee> getEmployees() {		
		return toModel.listEmployeesEntityToModel(repository.findAll());
	}
	
	@GetMapping(value="/listEmployee/{id}")
	private Employee getContact(@PathVariable Long id){
		Optional<ma.ibm.entities.Employee> e = repository.findById(id);
		return toModel.empEntityToModel(e.get());
	}
	
	@PostMapping(value="/listEmployee")
	private Employee save(@RequestBody ma.ibm.entities.Employee e){
		return toModel.empEntityToModel(repository.save(e));
	}
	
	@DeleteMapping(value="/listEmployee/{id}")
	private boolean delete(@PathVariable Long id){
		repository.deleteById(id);
	 return true;
	}
	@PutMapping(value="/listEmployee/{id}")
	private Employee save(@PathVariable Long id, @RequestBody ma.ibm.entities.Employee e){
		e.setId(id);
		return toModel.empEntityToModel(repository.save(e));
	}

}
