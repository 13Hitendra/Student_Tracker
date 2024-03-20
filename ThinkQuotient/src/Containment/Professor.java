package Containment;

import java.util.Scanner;

public class Professor {
	Scanner sc=new Scanner(System.in);
	private String pName;
	private int contactNo;
	private double salary;
	
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	Professor()
	{
		
	}
	Professor(String pName,int contactNo,double salary)
	{
		this.pName=pName;
		this.contactNo=contactNo;
		this.salary=salary;
	}
	
	public void showData()
	{
		System.out.println(" Professor name = "+pName);
		System.out.println("contact number = "+contactNo);
		System.out.println("salary of prof = "+salary);
		
	}
}
