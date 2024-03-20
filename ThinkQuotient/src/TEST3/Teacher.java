package TEST3;

import java.util.Scanner;

public abstract class Teacher
{	
	Scanner sc=new Scanner(System.in);
	int Tid,MobileNo;
	String Name;
	
	Teacher(){}

	Teacher(int Tid,int mNo,String name)
	{	//System.out.prinitln("Enter teacher id");
		this.Tid=Tid;
		this.MobileNo=mNo;
		this.Name=name;
	}
	
	public abstract void salary();

}