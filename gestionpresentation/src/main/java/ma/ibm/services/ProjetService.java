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
import ma.ibm.models.Projet;

@Service
public class ProjetService implements IProjetService {

	@Autowired
	IConvertStringToListObj convert;
	
	@Override
	public List<Projet> getProjets() {
		List<Projet> projets = new ArrayList<Projet>();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/projets";
        ResponseEntity<String> rateResponse = restTemplate.getForEntity(url,String.class);
		String response = rateResponse.getBody();
		System.out.println(response);
        projets = convert.stringtoProjets(response);
        return projets;
	
	}

	@Override
	public Projet getProjet(Long id) {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/projets/"+id;
        ResponseEntity<Projet> rateResponse = restTemplate.getForEntity(url,Projet.class);
        Projet response = rateResponse.getBody();
		return response;
	}

	@Override
	public Projet saveProjet(Projet em) {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/projets/";
        Projet response = restTemplate.postForObject(url,em,Projet.class);
		return response;
	}

	@Override
	public Projet updateProjet(Long id, Projet em) {
		try {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/projets/"+id;
         restTemplate.put(url,em);
		return getProjet(id);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return null;
		}
	}

	@Override
	public boolean deleteProjet(Long id) {
		try {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/projets/"+id;
        restTemplate.delete(url);
        System.out.println("La suppression est bien passee");
		return true;
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public List<Employee> getProjetEmployeesByProId(Long id) {
		List<Employee> employees = new ArrayList<Employee>();
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        String url = "http://localhost:8083/gestion-projets/projets/"+id+"/employees";
        ResponseEntity<String> rateResponse = restTemplate.getForEntity(url,String.class);
		String response = rateResponse.getBody();
		System.out.println(response);
		employees = convert.stringtoEmployees(response) ;
        return employees;
		
	}

   
}