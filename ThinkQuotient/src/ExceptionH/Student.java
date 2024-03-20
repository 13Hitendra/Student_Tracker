package ExceptionH;

import java.util.Scanner;

public class Student extends InvalidMarkException{

	int rollno;
	static String name;
	
	public Student() {
		
	}
	
	public static void setData(int m) throws InvalidMarkException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		marks=m;
		if(marks<0 || marks>100)
		{
			throw new InvalidMarkException(marks);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		try {
			obj.setData(101);
		} catch (InvalidMarkException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
