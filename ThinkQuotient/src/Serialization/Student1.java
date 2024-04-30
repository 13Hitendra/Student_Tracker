package Serialization;

import java.io.Serializable;

public class Student1 implements Serializable {
	int id;
	String name;
	transient double marks;
	Course course;

	public Student1() {
		
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

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

	public Student1(int id, String name, double marks, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

public static void main(String [] asdf) {
		Course course1=new Course(112,"Python",12000);
		Student1 s1= new Student1(1,"Sagar",89,course1);
		System.out.println(s1);
		
	}

}
