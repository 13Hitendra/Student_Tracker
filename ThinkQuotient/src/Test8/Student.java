package Test8;

class Student{
	int id,passingYear;
	String name,degree;
	boolean placed;

	public Student(int id,String name,String degree,int passingYear,boolean placed)
	{
		this.id=id;
		this.name=name;
		this.degree=degree;
		this.passingYear=passingYear;
		this.placed=placed;
	}

	public String toString(){
		return "id="+id+" name="+name+"  degree="+degree+"  passing year="+passingYear+"  placed="+placed;
	}
}

