package ma.ibm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	

}
