package OOPs;

import java.util.Scanner;

public class Employee {
	int Id;
	String Name;
	
	Employee()
	{
		System.out.println("Default Employee Constructor called.");
	}
	
	Employee(int id, String name)
	{
		Id=id;
		System.out.println("ID :"+Id);
		Name=name;
		System.out.println("Name :"+Name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		
		Employee E=new Employee();
		System.out.println("now call parameterized constructor =");
		Employee E1=new Employee(101,"XYZ");
		
	}

}
