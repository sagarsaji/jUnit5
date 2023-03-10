package ustbatchno3.junit5testcases;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import count.vowel;

/**
 * @author Administrator
 *
 */
public class vowelTest {
	
	@Test
	public void counttesting() {
		
		String input ="sharath";
		
		int expected=2;
		int actual=vowelTest.vowelscount(input);
		assertEquals(expected,actual);
		
	}

	private static int vowelscount(String input) {
		// TODO Auto-generated method stub
		int count = 0;
		String s = input;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
	
	
	

}
