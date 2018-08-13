package ma.ibm;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ma.ibm.services.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestService {
	
	@Autowired
	private EmployeeService service;
	
	@Ignore
	@Test
	public void getEmployees() {
		assertEquals(service.getEmployees().size(),7);
	}
}
