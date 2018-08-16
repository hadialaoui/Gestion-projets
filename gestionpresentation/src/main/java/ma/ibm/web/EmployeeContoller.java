package ma.ibm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import ma.ibm.models.Employee;
import ma.ibm.models.LongType;
import ma.ibm.services.IEmployeeService;

@Controller
public class EmployeeContoller {

	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value = "/staticResourceTest")
	public String getView(Model model) {
		model.addAttribute("employees",employeeService.getEmployees());
		return "index";
	}
	
	@GetMapping(value="/newEmployee")
	private String newEmployee(Model model){
		model.addAttribute("employee", new Employee());
	 return "ajouterEmp";
	}
	
	@GetMapping(value="/updateEmployee/{id}")
	private String updateEmployee(@PathVariable Long id,Model model){
		Employee e = employeeService.getEmployee(id);
		model.addAttribute("employee", e);
	 return "editEmp";
	}
	
	@GetMapping(value="/listEmployee/{id}")
	private String getEmployee(@PathVariable Long id,Model model){
		model.addAttribute("employee",employeeService.getEmployee(id));
		return "index";
	}
	
	@PostMapping(value="/listEmployee")
	private String save(@ModelAttribute Employee e,Model model){
		model.addAttribute("employee",employeeService.saveEmployee(e));
		return "confirmation";
	}
	
	@GetMapping(value="/listEmployee/delete/{id}")
	private String delete(@PathVariable Long id, Model model){
		//model.addAttribute("deleted",employeeService.deleteEmployee(id));
		boolean test = employeeService.deleteEmployee(id);
		model.addAttribute("employees",employeeService.getEmployees());
		System.out.println(test);
	 return "index";
	}
	
	@GetMapping(value="/employees/{id}/projets")
	private String projetsEmp(@PathVariable Long id, Model model){
		model.addAttribute("employee",employeeService.getEmployee(id));
		//boolean test = employeeService.deleteEmployee(id);
		System.out.println(id+" EmployeeController avant");
		model.addAttribute("projets",employeeService.getEmployeeProjetsByEmpId(id));
		System.out.println(id+" EmployeeController apres");
	 return "projetsEmployee";
	}
	
	@PostMapping(value="/listEmployee/put/{id}")
	private String update(@PathVariable Long id, @ModelAttribute Employee e,Model model){
		model.addAttribute("employee",employeeService.updateEmployee(id, e));
		return "confirmation";
	}
	
	@PostMapping(value="/affectationProjet/{id}")
	private String affectationProjet(@PathVariable Long id, @ModelAttribute LongType idProjet,Model model){
		model.addAttribute("idEmployee",id);
		System.out.println(idProjet.getNumber());
		employeeService.affectationProjet(id, idProjet);
		model.addAttribute("projets",employeeService.getEmployeeProjetsByEmpId(id));
		return "projetsEmployee";
	}
	
}
