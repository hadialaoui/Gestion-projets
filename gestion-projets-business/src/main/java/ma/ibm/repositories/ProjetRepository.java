package ma.ibm.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.ibm.entities.Employee;
import ma.ibm.entities.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long>{
	@Query("SELECT p.employees FROM Projet p WHERE p.id = :id")
	public List<Employee> getProjetEmployeesByProId(@Param("id") Long id);
}
