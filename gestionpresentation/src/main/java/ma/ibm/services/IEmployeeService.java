package ma.ibm.services;

import java.util.List;

import ma.ibm.models.Employee;

public interface IEmployeeService {
	public List<Employee> getEmployees();
	public Employee getEmployee(Long id);
	public Employee saveEmployee(Employee em);
	public Employee updateEmployee(Long id,Employee em);
	public boolean deleteEmployee(Long id);
}
