package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
//import java.time.LocalDate;

import org.junit.Test;
import ustbatchno3.junit5testcases.Gold;

public class Goldtest {
	
	@Test
	public void testDate5() {
		
		Gold g=new Gold();
		assertEquals("5",g.findcoins(LocalDate.of(2022, 2,2)));
		assertEquals("3",g.findcoins(LocalDate.of(2022, 4,2)));
		assertEquals("1",g.findcoins(LocalDate.of(2022, 8,2)));
		assertEquals(null,g.findcoins(LocalDate.of(2022, 11,2)));
		
		
	}

	
	
}