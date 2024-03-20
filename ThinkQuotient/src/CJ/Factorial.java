package CJ;

import java.util.Scanner;

public class Factorial {
		int fact;
		
	public void setNum(int num)
	{
		fact=num;	
		System.out.println("Number : "+fact);
	}
	
	public void logic() 
	{
		for(int i=1;i<=fact;i++) {
			fact=fact*i;
		}	
		System.out.println("Factorial is :"+fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		Factorial f=new Factorial();
		f.setNum(4);
		f.logic();
		
	}
	
}
