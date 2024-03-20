package Containment;

import java.util.Scanner;

public class BookFair {
	Scanner sc=new Scanner(System.in);
	String Bname;
	double price;
	double discPrice;

	BookFair()
	{

	} 
	
	public void Input()
	{
		System.out.println("Enter book name ");
		Bname=sc.nextLine();
		System.out.println("Enter price of book ");
		price=sc.nextDouble();
	}
	
	public void calculate()
	{
		if (price<=1000)
		{
			discPrice=price-(price*0.02);
		}
		else if(price<=3000)
		{
			discPrice=price-(price*0.1);
		}
		else
		{
			discPrice=price-(price*0.15);
		}
	}

	public void display()
	{
		System.out.println("Book Name : "+Bname);
		System.out.println("Price after discount : "+discPrice);
	}

	public static void main(String []hitendra)
	{
		BookFair b1=new BookFair();
		b1.Input();
		b1.calculate();
		b1.display();
	}
}
