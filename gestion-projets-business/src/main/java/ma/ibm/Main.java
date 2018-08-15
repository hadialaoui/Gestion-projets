package ma.ibm;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import ma.ibm.entities.Employee;
import ma.ibm.entities.Projet;
import ma.ibm.repositories.EmployeeRepository;



@SpringBootApplication
@EntityScan(basePackages= {"ma.ibm"})
public class Main implements CommandLineRunner {
	
	  @Autowired
	    private EmployeeRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       Employee e= new Employee("HADI ","Mohamed", "Emp5478", "Emp", new Date());
		
		for(int i=0; i<3;i++) {
			Projet p= new Projet("Selfcare "+i, new Date(), new Date()  , "Emp5458 "+i);
			e.getProjets().add(p);
		}
		empRepository.save(e);	
	}

	

}
 