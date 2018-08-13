package ma.ibm.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nom;
	private String prenom;
	private String refog;
	private String statut;
	private Date dateIntegration;
	


	public Employee() {}
	
	public Employee(Long id, String nom, String prenom, String refog, String statut, Date dateIntegration
			) {
		
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.refog = refog;
		this.statut = statut;
		this.dateIntegration = dateIntegration;
		
	}

	public Employee(String nom, String prenom, String refog, String statut, Date dateIntegration) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.refog = refog;
		this.statut = statut;
		this.dateIntegration = dateIntegration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
