package CJ;

import java.util.Scanner;

public class Switch_Case2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Month name :");
		String Month=sc.nextLine();
		
		
		switch(Month) {
		case "January":
				System.out.println("This is first month");
				break;
		case "February":
			System.out.println("This is second month");
			break;
		case "March":
			System.out.println("This is third month");
			break;
		case "April":
			System.out.println("This is forth month");
			break;
		}
	}

}
