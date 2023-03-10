package ustbatchno3.junit5testcases;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst = Arrays.asList("sasi","abu","kodiyan","abu","sasi");
		long count = dupcount(lst);
		System.out.println(count);
	}
	
	public static long dupcount(List<String> s) {
		
		long m = s.stream().filter(t->t.contains("sasi")).count();
		return m;
	}

}
