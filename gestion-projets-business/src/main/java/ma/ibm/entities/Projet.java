package ma.ibm.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "projets")
public class Projet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String refogRespo;
    
    @ManyToMany( fetch = FetchType.LAZY,
			     cascade = { CascadeType.ALL},
			     mappedBy = "projets")
    private Set<Employee> employees = new HashSet<Employee>();
    
    
	public Projet() {}
	
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
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public boolean addEmployee(Employee e) {
		return employees.add(e);
	}
	public boolean removeEmployee(Employee e) {
		return employees.remove(e);
	}
	
    
}
