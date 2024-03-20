package Lab;

//1. Write a Java program print total number of days in a month using switch case 

import java.util.Scanner;

public class MonthDays {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int year=2000;
		System.out.println("Enter month number : ");
		int no=sc.nextInt();
		switch(no) {
			case 1:
				System.out.println("January has 31 days");
				break;
				
			case 2:
				System.out.println("Enter Year :");
				int year=sc.nextInt();
				if((year%4==0)&&(year%100!=0)||(year%400==0)) {
					System.out.println("February has 29 days");
					break;
				}
				else {
				System.out.println("February has 28 days");}
				break;
				
			case 3:
				System.out.println("March has 30 days");
				break;
				
			case 4:
				System.out.println("April has 31 days");
				break;
				
			default :
				System.out.println("Invalid month entered.");
		}
		sc.close();
	}

}
