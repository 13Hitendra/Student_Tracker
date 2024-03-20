package ArrayAssignment;

import java.util.Arrays;

public class Student {
	
	private int id;
	private String name,status;
	private double percentage;
	private double marks[];
	
	Student(){}
	
	public Student(int id, String name, double[] marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus() {
		if (percentage>=40) {
			status="Pass";
		}
		else {	status="Fail";	}
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage() {
		int sum=0;
		for(double m:marks)
		{
			sum+=m;
		}
		 percentage=(sum*100)/300;
	}

	public double[] getMarks() {
		return marks;
	}


	public void setMarks(double[] marks) {
		this.marks = marks;
	}


	public String toString()
	{
		return "id="+id+"   Name="+name+"    marks="+Arrays.toString(marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []s1=new Student[4];
		Student std=new Student();
		
		double mk1[]= {54,63,78};
		s1[0]=new Student(1,"Sagar",mk1);
		
		double mk2[]= {58,98,83};
		s1[1]=new Student(2,"Sanket",mk2);
		
		double mk3[]= {54,63,78};
		s1[2]=new Student(3,"Nishant",mk3);
		
		double mk4[]= {25,21,43};
		s1[3]=new Student(4,"Hitendra",mk4);
		
		/*for (Student s: s1) {
			System.out.println(s);
		}*/
		
		for(Student a:s1) {
			a.setPercentage();
			a.setStatus();
		}
		
		for(Student a:s1) {
			System.out.println("id="+a.id+"		"+a.getPercentage()+"		"+a.getStatus());		
		}
		System.out.println("----------------------------------");
		for(Student ec : s1) {
			if(ec.percentage>=40)
			{
				System.out.println(ec+"      "+ec.getStatus());
			}
		}
		System.out.println("-----------------------------------------");
		
		double high=0;
		for(Student top:s1) {	
			if(top.percentage>high) {
				high=top.percentage;
				std=top;
			}
		}
		System.out.println("topper is = "+std.name);
		System.out.println("-------------------------------------------------------");
		
		for(int i=0;i<s1.length;i++) {
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].percentage==s1[j].percentage)
				{
					System.out.println(s1[j].name+"  has same perccentage  as "+s1[i].name);
				//	break;
				}
			}
		}
		
	}
	
}
