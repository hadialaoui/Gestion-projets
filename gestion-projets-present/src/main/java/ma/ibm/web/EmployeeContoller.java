package ma.ibm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ma.ibm.services.IEmployeeService;

@Controller
@RequestMapping("/gestionprojets")
public class EmployeeContoller {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/test")
	public String getView(Model model) {
		model.addAttribute("employees",employeeService.getEmployees());
        return "index";
	}
	
}
