package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import ustbatchno3.junit5testcases.Garment;

public class Garmenttest {
	
	@Test
	public void garmentestt() {
		
		Garmentdress tshirt = new Garmentdress(100,100,"tshirt");
		Garmentdress shirt = new Garmentdress(200,200,"shirt");
		Garmentdress pant = new Garmentdress(300,300,"pant");
		
		List<Garmentdress> lst = Arrays.asList(tshirt,shirt,pant);
		LocalDate d = LocalDate.of(2022, 9, 10);
		
		Map<LocalDate,List<Garmentdress>> expected = new HashMap<LocalDate,List<Garmentdress>>();
		
		expected.put(d,lst);
		
		
		List<LocalDate> dtee = Arrays.asList(d);
		
		assertEquals(lst,Garment.compre(d, expected, dtee));
		
		
	}
}
