package ustbatchno3.junit5testcases;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Garment {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		Garmentdress tshirt = new Garmentdress(100,100,"tshirt");
		Garmentdress shirt = new Garmentdress(200,200,"shirt");
		Garmentdress pant = new Garmentdress(300,300,"pant");
		
		Garmentdress tshirt1 = new Garmentdress(90,90,"tshirt");
		Garmentdress shirt1 = new Garmentdress(100,100,"shirt");
		Garmentdress pant1 = new Garmentdress(200,200,"pant");
		
		Garmentdress tshirt2 = new Garmentdress(80,80,"tshirt");
		Garmentdress shirt2 = new Garmentdress(90,90,"shirt");
		Garmentdress pant2 = new Garmentdress(70,70,"pant");
		
		List<Garmentdress> lst = Arrays.asList(tshirt,shirt,pant);
		List<Garmentdress> lst1 = Arrays.asList(tshirt1,shirt1,pant1);
		List<Garmentdress> lst2 = Arrays.asList(tshirt2,shirt2,pant2);
		
		
		
		//lst.forEach(t->System.out.println(t));
		System.out.println("Enter a date : ");
		int y=n.nextInt();
		int mm=n.nextInt();
		int dd=n.nextInt();
		
		
		
		LocalDate e = LocalDate.of(y,mm,dd);
		
		Map<LocalDate,List<Garmentdress>> m = new HashMap<LocalDate,List<Garmentdress>>();
		
		LocalDate d1 = LocalDate.of(2023, 2, 10);
		LocalDate d2 = LocalDate.of(2023, 3, 11);
		LocalDate d3 = LocalDate.of(2023, 4, 12);
		
		List<LocalDate> dtee = Arrays.asList(d1,d2,d3);
		
		m.put(d1, lst);
		m.put(d2, lst1);
		m.put(d3, lst2);
		
		List<Garmentdress> lss = compre(e,m,dtee);
		System.out.println(lss);
		
	}
	public static List<Garmentdress> compre(LocalDate e,Map<LocalDate,List<Garmentdress>> m,List<LocalDate> dte) {
		
		
		
		for(LocalDate ee : dte) {
			if(e.isEqual(ee)) {
				return m.get(ee);
			}
		}
		return null;
		
	}
	
	
}
