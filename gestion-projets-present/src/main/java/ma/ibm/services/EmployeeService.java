package ma.ibm.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ma.ibm.models.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Override
	public List<Employee> getEmployees() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        
        String url = "http://localhost:8083/gestion-projets/listEmployee";
		
        ResponseEntity<Employee[]> responseEntity = restTemplate.getForEntity(url, Employee[].class);
		Employee[] objects = responseEntity.getBody();
		List<Employee> employees = Arrays.asList(objects);
		
        employees.forEach(em->System.out.println(em.getNom()));
        
            return employees;
	}
	
	
}