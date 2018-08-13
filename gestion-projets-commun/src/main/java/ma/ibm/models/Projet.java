package ma.ibm.models;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Projet implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String refogRespo;
    
    
    public Projet() {}
	
	public Projet(Long id, String nom, Date dateDebut, Date dateFin, String refogRespo) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.refogRespo = refogRespo;
	}

	public Projet(String nom, Date dateDebut, Date dateFin, String refogRespo) {
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.refogRespo = refogRespo;
		
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
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getRefogRespo() {
		return refogRespo;
	}
	public void setRefogRespo(String refogRespo) {
		this.refogRespo = refogRespo;
	}
	
    
}
