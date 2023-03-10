package ustbatchno3.junit5testcases;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

public class Gold {

	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int y,m,d;
		y = n.nextInt();
		m = n.nextInt();
		d = n.nextInt();
		LocalDate dte = LocalDate.of(y,m,d);
		String ans = findcoins(dte);
		System.out.println(ans);
	}

	public static String  findcoins(LocalDate date) {
		int day= date.getDayOfYear();
		if(day<80 || day>365) {
			return "5";
		}
		else if(day<172) {
			return "3";
		}
		else if(day<266) {
			return "1";
		}
		else {
		 return  null;
		}
	}
}
		