package ma.ibm.services;

import java.util.List;

import ma.ibm.models.Employee;
import ma.ibm.models.Projet;

public interface IProjetService {
	public List<Projet> getProjets();
	public Projet getProjet(Long id);
	public Projet saveProjet(Projet projet);
	public Projet updateProjet(Long id,Projet projet);
	public boolean deleteProjet(Long id);
}
