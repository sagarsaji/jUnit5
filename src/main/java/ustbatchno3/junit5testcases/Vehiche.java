package ustbatchno3.junit5testcases;

import java.util.Scanner;

public class Vehiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner n = new Scanner(System.in);
		
		String state = "KL";
		
		System.out.println("State : "+state);
		System.out.println("Enter the sub number : ");
		int dis = n.nextInt();
		
		System.out.println("Enter remaining number : ");
		String n3 = n.next();
		
		System.out.println("The reg number is :"+state+" "+dis+" "+n3);
		System.out.println("State : Kerala");
		System.out.println("District is : " + district(dis));
	}
	
	public static String district(int dis) {
		String district="";
		switch(dis) {
		case 1: district = "Thiruvananthapuram";
				break;
		case 2: district = "Kollam";
				break;
		case 3: district = "Pathanamthitta";
				break;
		case 4: district = "Alapuzha";
				break;
		case 5: district = "Kottayam";
				break;
		case 6: district = "Idukki";
				break;
		case 7: district = "Ernakulam";
				break;
		case 8: district = "Thrissur";
				break;
		default: System.out.println("invalid code");
		        break;
		}
		return district;
		
	}

}
