package ma.ibm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ma.ibm.metier.ClassAuto;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestService {
	@Autowired
	ClassAuto metier;
	
	@Test
	public void testMetierNbreCaracteres() {
		assertEquals(metier.nbreCaracteres("hadial"), 6);
	}
}
