package ma.ibm.metier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ma.ibm.models.Employee;
import ma.ibm.models.Projet;

@Service
public class ConvertStringToListObjImpl implements IConvertStringToListObj{

	@Override
	public List<Projet> stringtoProjets(String data) {
		// TODO Auto-generated method stub
		TypeReference<List<Projet>> mapType = new TypeReference<List<Projet>>() {};
		List<Projet> projets = new ArrayList<Projet>();
		ObjectMapper mapper = new ObjectMapper();
		try {
			projets = mapper.readValue(data, mapType);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return projets;
	}

	@Override
	public List<Employee> stringtoEmployees(String data) {
		// TODO Auto-generated method stub
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
