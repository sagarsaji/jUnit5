package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import ustbatchno3.junit5testcases.Duplicate;

public class CountTest {

	@Test
	public void duplitest() {
		List<String> lst= Arrays.asList("sasi","abu","kodiyan","abu","sasi");
		int expected = 2;
		long actual = Duplicate.dupcount(lst);
		assertEquals(expected,actual);
	}
	
}
