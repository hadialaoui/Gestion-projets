package ma.ibm.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersonne;
    private String nom;
    private String prenom;
    private String refog;
    private String statut;
    private Date dateIntegration;
    
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getRefog() {
		return refog;
	}
	public void setRefog(String refog) {
		this.refog = refog;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public Date getDateIntegration() {
		return dateIntegration;
	}
	public void setDateIntegration(Date dateIntegration) {
		this.dateIntegration = dateIntegration;
	}
    
    
}
