package Containment;

import java.util.Scanner;

public class Book {
	Scanner sc=new Scanner(System.in);
	
	int bookId,price,copies;
	double discount=0.2, discountedPrice;
	Author author;
	Book(){}  //default constrctr
	Book(int bookId,int price,int copies)
	{
		this.bookId=bookId;
		this.price=price;
		this.copies=copies;
	}
	
	public void calcDisc()
	{
		discountedPrice=price-(price*discount);
	}
	public void setData()
	{
		System.out.println("Enter book id ");
		bookId=sc.nextInt();
		System.out.println("Enter Price of book");
		price=sc.nextInt();
		System.out.println("Number of copies ");
		copies=sc.nextInt();
	}
	public void displayData()
	{
		System.out.println("ID    ="+bookId);
		System.out.println("Price    ="+price);
		calcDisc();
		System.out.println("Discounted Price   ="+discountedPrice);
		System.out.println("Number of Copies   ="+copies);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Author author=new Author(456,"Mr.Anyone","qwerty");       //passing values to constructor of author class
	/*	Author author=new Author();				//setting values by set method
		author.setAuthorId(111);
		author.setAuthorName("Mr.Nobody");
		author.setEmail("xyz@abc.com");
		
		Book b1=new Book(222,500,20);
		author.showData();
		b1.displayData();    */
		
		Book b2=new Book();  // taking values from user
		b2.setData();
		b2.displayData();
	}

}

