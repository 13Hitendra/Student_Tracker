package CJ;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Choice number :");
		int num=sc.nextInt();
		switch(num) {
				case 1: System.out.println("monday");
					break;
				case 2:System.out.println("Tuesday");	
					break;
				case 3: System.out.println("Sunday");
					break;
				default: System.out.println("Invalid Number");	
		}
		sc.close();		
	}
}
