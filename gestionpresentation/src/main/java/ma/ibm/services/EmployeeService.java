package ma.ibm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ma.ibm.metier.IConvertStringToListObj;
import ma.ibm.models.Employee;
import ma.ibm.models.LongType;
import ma.ibm.models.Projet;

@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	IConvertStringToListObj convert;

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/listEmployee";
        ResponseEntity<String> rateResponse = restTemplate.getForEntity(url,String.class);
		String response = rateResponse.getBody();
		System.out.println(response);
        employees = convert.stringtoEmployees(response);
        return employees;
	
	}

	@Override
	public Employee getEmployee(Long id) {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/listEmployee/"+id;
        ResponseEntity<Employee> rateResponse = restTemplate.getForEntity(url,Employee.class);
        Employee response = rateResponse.getBody();
		return response;
	}

	@Override
	public Employee saveEmployee(Employee em) {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/listEmployee/";
        Employee response = restTemplate.postForObject(url,em,Employee.class);
		return response;
	}

	@Override
	public Employee updateEmployee(Long id, Employee em) {
		try {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/listEmployee/"+id;
         restTemplate.put(url,em);
		return getEmployee(id);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public boolean deleteEmployee(Long id) {
		try {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/listEmployee/"+id;
        restTemplate.delete(url);
        System.out.println("La suppression est bien passee");
		return true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public List<Projet> getEmployeeProjetsByEmpId(Long id) {
		List<Projet> projets = new ArrayList<Projet>();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/employees/"+id+"/projets";
        ResponseEntity<String> rateResponse = restTemplate.getForEntity(url,String.class);
		String response = rateResponse.getBody();
		System.out.println(response);
		projets = convert.stringtoProjets(response) ;
        return projets;
	}

	@Override
	public void affectationProjet(Long idEmp, LongType idProjet) {
		try {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
       // http://localhost:8083/gestion-projets/affectationProjet/1/62
        String url = "http://localhost:8083/gestion-projets/affectationProjet/"+idEmp;
        restTemplate.put(url, idProjet);
        System.out.println("Service affectation tout est bien passee");
       
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			
		}
	}

	
	

}