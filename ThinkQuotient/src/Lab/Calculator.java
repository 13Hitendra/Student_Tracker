package Lab;

import java.util.Scanner;

//4. Write a Java program to create Simple Calculator using switch case Menu Driven 


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1-Addition  2- Substraction  3-Multiplication  4-Division");
		System.out.println("Enter Operation number be done");
		int opNum=sc.nextInt();
		int result;
		
		System.out.println("Enter First number");
		 int a=sc.nextInt();
		System.out.println("Enter Second number");
		 int b=sc.nextInt();
		
		switch(opNum) {
		case 1 :			
			 result=a+b;
			System.out.println("Addition of  "+a +" and "+b+" is "+"= "+result);
			break;
			
		case 2 :		
			 result=a-b;
			System.out.println("substraction of  "+a +" and "+b+" is "+"= "+result);
				break;
			
		case 3 :
			result=a*b;
					System.out.println("Multiplication of  "+a +" and "+b+" is "+"= "+result);
						break;
	
		case 4 :
			result=a/b;
						System.out.println("division of  "+a +" and "+b+" is "+"= "+result);
							break;
							
				default : System.out.println("invalid Operation selected.");
		}
		sc.close();
	}

}
