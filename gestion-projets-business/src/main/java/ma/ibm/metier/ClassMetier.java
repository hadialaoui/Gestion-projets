package ma.ibm.metier;

import org.springframework.stereotype.Component;

@Component
public class ClassMetier {
	
   public int nbreCaracteres(String nom) {
	   return nom.length();
   }
}
