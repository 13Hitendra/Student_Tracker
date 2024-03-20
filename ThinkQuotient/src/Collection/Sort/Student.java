package Collection.Sort;

import java.util.ArrayList;

public class Student {

	String name;
	int rollNo;
	ArrayList <Double>marks;
	
	
	@Override
	public String toString() {
		return name + ", rollNo=" + rollNo + ", marks=" + marks ;
	}


	public Student(String name, int rollNo, ArrayList<Double> marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.marks = marks;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>marks=new ArrayList<>();
		marks.add(78);
		marks.add(98);
		marks.add(46);
		
		
	}

}
