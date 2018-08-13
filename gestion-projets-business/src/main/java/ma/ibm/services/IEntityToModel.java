package ma.ibm.services;

import java.util.List;

import ma.ibm.models.Employee;
import ma.ibm.models.Projet;

public interface IEntityToModel {

	public Employee empEntityToModel(ma.ibm.entities.Employee emp);

	public Projet proEntityToModel(ma.ibm.entities.Projet pro);

	public List<Employee> listEmployeesEntityToModel(List<ma.ibm.entities.Employee> employees);

	public List<Projet> listProjetsEntityToModel(List<ma.ibm.entities.Projet> projets);
}
