package Abstraction;

import java.util.Scanner;

public abstract class Account {
	Scanner sc=new Scanner(System.in);
	
	String userName,email;
	double balance,contactNo;
	
	Account()
	{
		System.out.println("Enter User Name ");
		userName=sc.nextLine();
		System.out.println("enter Email ");
		email=sc.nextLine();
		System.out.println("enter Balance ");
		balance=sc.nextDouble();
		System.out.println("Enter Contact number");
		contactNo=sc.nextDouble();
	}
	public void deposit(double depo)
	{
		this.balance=balance+depo;
	}
	
	public void withdraw(double wd)
	{
		this.balance=balance-wd;
	}
	
	public abstract double calculate();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
