package Containment;

import java.util.Scanner;

public class College {

	private String cname;
	private Department dept;
	private Professor prof;
	
	public College() {
		// TODO Auto-generated constructor stub
		cname=" ";
		dept=new Department();
	}
	public College(String cname,Department d)
	{
		this.cname=cname;
		this.dept=d;
	}
	public void setCname(String nm)
	{
		cname=nm;
	}
	public String getCname()
	{
		return cname;
	}
	public void setDept(Department obj)
	{
		this.dept=obj;
	}
	public Department getDept()
	{
		return dept;
	}
	public void show()
	{
		System.out.println("College name "+cname);
		this.dept.show();
		//System.out.println(dept.getName());
		System.out.println("_____________________________________________");
	}
	public void setData()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter College name");
		this.cname=sc.next();
		this.dept.setData();
	/*	System.out.println("Enter Deptpartment Id");
		int id=sc.nextInt();
		System.out.println("Enter Department name");
		String nm=sc.next();
		this.dept.setDeptId(id);
		this.dept.setName(nm);*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	College c1=new College();
		c1.show();
		
		College c2=new College("VIT", new Department(101, "Instrumenttation"));
		c2.show();
		
		College c3=new College();
		c3.setCname("MIT");
		Department obj=new  Department(102, "AI");
		c3.setDept(obj);
		c3.show();
		
		College c4=new College();
		c4.setData();
		c4.show();      */
		
		Professor p1=new Professor("Kulkarni",789,123.654);
		p1.showData();
	
	}

}
