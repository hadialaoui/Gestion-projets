package ma.ibm.metier;

import java.util.List;

import ma.ibm.models.Employee;
import ma.ibm.models.Projet;

public interface IConvertStringToListObj {
	
	public List<Projet> stringtoProjets(String data);
	
	public List<Employee> stringtoEmployees(String data);
}
