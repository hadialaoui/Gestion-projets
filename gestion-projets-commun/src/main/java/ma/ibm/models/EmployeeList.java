package ma.ibm.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Employee> employees;
 
    public EmployeeList() {
        employees = new ArrayList<>();
    }

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
 
   
}