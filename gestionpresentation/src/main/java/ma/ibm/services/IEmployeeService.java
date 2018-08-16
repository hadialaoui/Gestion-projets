package ma.ibm.services;

import java.util.List;

import ma.ibm.models.Employee;
import ma.ibm.models.LongType;
import ma.ibm.models.Projet;

public interface IEmployeeService {
	public List<Employee> getEmployees();
	public Employee getEmployee(Long id);
	public Employee saveEmployee(Employee em);
	public Employee updateEmployee(Long id,Employee em);
	public boolean deleteEmployee(Long id);
	public List<Projet> getEmployeeProjetsByEmpId(Long id);
	public void affectationProjet(Long idEmp, LongType idProjet);
}
