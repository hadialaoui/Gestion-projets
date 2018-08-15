package ma.ibm.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ma.ibm.models.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/listEmployee";
        ResponseEntity<String> rateResponse = restTemplate.getForEntity(url,String.class);
		String response = rateResponse.getBody();
		System.out.println(response);
        employees = stringtoEmpList(response);
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

	public List<Employee> stringtoEmpList(String data){
		TypeReference<List<Employee>> mapType = new TypeReference<List<Employee>>() {};
		List<Employee> employees = new ArrayList<Employee>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			employees = mapper.readValue(data, mapType);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return employees;
	}

}