package ma.ibm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ibm.entities.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long>{

}
