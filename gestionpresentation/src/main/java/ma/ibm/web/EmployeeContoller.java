package ma.ibm.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.ibm.models.Employee;
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
	
	@GetMapping(value="/listEmployee/{id}")
	private String getEmployee(@PathVariable Long id,Model model){
		model.addAttribute("employee",employeeService.getEmployee(id));
		return "index";
	}
	
	@PostMapping(value="/listEmployee")
	private String save(@RequestBody Employee e,Model model){
		model.addAttribute("employeeSave",employeeService.saveEmployee(e));
		return "index";
	}
	
	@GetMapping(value="/listEmployee/delete/{id}")
	private String delete(@PathVariable Long id, Model model){
		//model.addAttribute("deleted",employeeService.deleteEmployee(id));
		boolean test = employeeService.deleteEmployee(id);
		System.out.println(test);
	 return "index";
	}
	
	@PostMapping(value="/listEmployee/put/{id}")
	private String update(@PathVariable Long id, @RequestBody Employee e,Model model){
		model.addAttribute("empUpdate",employeeService.updateEmployee(id, e));
		return "index";
	}
	
}
