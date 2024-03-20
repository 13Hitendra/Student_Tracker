package Containment;

import java.util.Scanner;

public class Department {

	private int deptId;
	private String name;
	public Department() {
		// TODO Auto-generated constructor stub
		deptId=0;
		name=" ";
	}
	public Department(int deptId,String name)
	{
		this.deptId=deptId;
		this.name=name;
	}
	public void setData()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Deptpartment Id");
		this.deptId=sc.nextInt();
		System.out.println("Enter Department name");
		this.name=sc.next();
	}
	public void show()
	{
		System.out.println("Department ID "+deptId);
		System.out.println("Department name "+name);
		
	}
	public void setDeptId(int id)
	{
		this.deptId=id;
	}
	public int getDeptId()
	{
		return deptId;
	}
	public void setName(String nm)
	{
		this.name=nm;
	}
	public String getName()
	{
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj=new Department(1, "CS");
		obj.show();
		obj.setDeptId(101);
		obj.setName("AI");
		obj.show();
	}

}
