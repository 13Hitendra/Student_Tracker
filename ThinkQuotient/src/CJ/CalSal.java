package CJ;

import java.util.Scanner;

public class CalSal {
	Scanner sc=new Scanner(System.in);
	
	int eid;
	String Name,Adress,Dept,Desg;
	double sal,da,hra,netsal,pf;
	long cellno;
	
	public void setData()
	{	
		System.out.println("Enter Id :");
		eid=sc.nextInt();
		System.out.println("Enter name :");
		Name=sc.nextLine();
		System.out.println("Enter Address :");
		Adress=sc.nextLine();
		System.out.println("Enter Department :");
		Dept=sc.nextLine();
		System.out.println("Enter Designition :");
		Desg=sc.nextLine();
		System.out.println("Enter Salary :");
		sal=sc.nextDouble();
	}
	
	public void CalSal()
	{
		System.out.println("Enter da ");
		da=sc.nextDouble();
		System.out.println("Enter hra ");
		hra=sc.nextDouble();
		System.out.println("Enter pf ");
		pf=sc.nextDouble();
		System.out.println("Netsal :");
		
	}
	public void show()
	{
		System.out.println("ID ="+eid);
		System.out.println("Name :"+Name);
		System.out.println("address :"+Adress);
		System.out.println("Department :"+Dept);
		System.out.println("Designition :"+Desg);
		System.out.println("da : "+da);
		System.out.println("hra : "+hra);
		System.out.println("pf : "+pf);
		System.out.println("Netsal : "+netsal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalSal cs=new CalSal();
		cs.setData();
		//cs.show();
	}

}
