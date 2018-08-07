package ma.ibm.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassAuto {
	
		 @Autowired
		 private ClassMetier classMetier;
		 
		 
		 public int nbreCaracteres(String nom) {
			 return classMetier.nbreCaracteres(nom);
		 }
	
}
