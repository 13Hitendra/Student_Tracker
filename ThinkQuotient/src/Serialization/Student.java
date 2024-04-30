package Serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID =1l;
	int rn;
	String name;
	float mark;
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", mark=" + mark + "]";
	}
	public Student(int rn, String name, float mark) {
		super();
		this.rn = rn;
		this.name = name;
		this.mark = mark;
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	

}
