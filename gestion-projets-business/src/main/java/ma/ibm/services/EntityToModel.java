package ma.ibm.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ma.ibm.models.Employee;
import ma.ibm.models.Projet;

@Service
public class EntityToModel implements IEntityToModel {

	@Override
	public Employee empEntityToModel(ma.ibm.entities.Employee emp) {
		return new Employee(emp.getId(), emp.getNom(), emp.getPrenom(), emp.getRefog(), emp.getStatut(),
				emp.getDateIntegration());
	}

	@Override
	public Projet proEntityToModel(ma.ibm.entities.Projet pro) {
		return new Projet(pro.getId(), pro.getNom(), pro.getDateDebut(), pro.getDateFin(), pro.getRefogRespo());
	}

	@Override
	public List<Employee> listEmployeesEntityToModel(List<ma.ibm.entities.Employee> employees) {
		List<Employee> employeesModel = new ArrayList<>();
		employees.forEach(emp -> {
			employeesModel.add(empEntityToModel(emp));

		});
		return employeesModel;
	}

	@Override
	public List<Projet> listProjetsEntityToModel(List<ma.ibm.entities.Projet> projets) {

		List<Projet> projetsModel = new ArrayList<>();
		projets.forEach(pro -> {
			projetsModel.add(proEntityToModel(pro));
		});

		return projetsModel;
	}

}
