package ma.ibm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.ibm.entities.Employee;
import ma.ibm.entities.Projet;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	@Query("SELECT e.projets FROM Employee e WHERE e.id = :id")
	public List<Projet> getEmployeeProjetsByEmpId(@Param("id") Long id);
}
