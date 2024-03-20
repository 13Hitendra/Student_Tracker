package Lab;

import java.util.Scanner;

//7. Write a Java program to enter number between 1 to 5 and print it in word

public class NumberName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number :");
		int num=sc.nextInt();
		
		switch(num) {
			case 1: System.out.println("One");
			break;
			
			case 2: System.out.println("Two");
			break;
			
			case 3: System.out.println("Three");
			break;
			
			case 4: System.out.println("Four");
			break;
			
			case 5: System.out.println("Five");
			break;
			
			default : System.out.println("Invalid number.");
		}
		sc.close();
	}

}
