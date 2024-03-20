package Collection.Sort;

import java.util.ArrayList;

public class StudentArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Student>student=new ArrayList<>();
		
		ArrayList <Double>m1=new ArrayList<>();
		m1.add(48.58);
		m1.add(78.68);
		m1.add(76.95);
		
		student.add(new Student("Ajay", 11,m1));
		
		ArrayList <Double>m2=new ArrayList<>();
		m2.add(59.58);
		m2.add(88.16);
		m2.add(53.95);
		student.add(new Student("Rahul", 12,m1));
		
		System.out.println(student);
		
	}

}
