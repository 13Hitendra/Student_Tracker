package LabOops;

/*1. Create a class Account with member Variable: 
 * long accountNo, String customerName.Make them public.*/

public class Account {
	public long accountNo;
	public String customerName;
	
	Account ()                         //default constructor
	{
		System.out.println("This is Default Constructor :");
		
	}
	
	Account (long accountNo,String customerName)
	{
		System.out.println("This is parameterized Constructor.");
		this.accountNo=accountNo;
		this.customerName=customerName;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account();
		
		System.out.println("Account no = "+ac.accountNo);
		System.out.println("Customer Name = "+ac.customerName);
		
		Account ac1=new Account(101,"JAVA");
		
		System.out.println("Account no = "+ac1.accountNo);
		System.out.println("Customer Name = "+ac1.customerName);
		
		Account ac2=new Account(102,"Python");
		
		System.out.println("Account no = "+ac2.accountNo);
		System.out.println("Customer Name = "+ac2.customerName);
		
	}

}
