package Serialization;

public class SchoolStudent extends Student1 {

	int standard;
	
	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public SchoolStudent(int id, String name, double marks, Course course,int standard) {
		super(id, name, marks, course);
		this.standard=standard;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SchoolStudent [standard=" + standard + ", id=" + id + ", name=" + name + ", marks=" + marks
				+ ", course=" + course + ", getId()=" + getId() + ", getName()=" + getName() + ", getMarks()="
				+ getMarks() + ", getCourse()=" + getCourse() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	public static void main(String []asdf) {
		SchoolStudent ss=new SchoolStudent(13,"ajay",78,new Course(45,"Java",23000),12);
		System.out.println(ss);
	}
	
}
