package Inheritance;

public class Vehicle {
	int regNo;
	String model;
	
	Vehicle(){
		regNo=0;
		model=" ";
	}
	
	Vehicle(int regNo, String model)
	{
		this.regNo=regNo;
		this.model=model;
	}
	
	public String toString()
	{
		return regNo+" - "+model;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		System.out.println(v);
		
		Vehicle v1=new Vehicle(778899,"K10");
		System.out.println(v1);
		
	}

}
