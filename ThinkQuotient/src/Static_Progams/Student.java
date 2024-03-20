package Static_Progams;
//Example of static method
public class Student {
	int id;
	String name;
	static String college="JSPM";
	
	static void change()
	{
		college="ICOER";
	}
	Student(int r, String n)
	{
		id=r;
		name=n;
	}
	void display()
	{
		System.out.println(id+"  "+name+"  "+college);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(456,"RAJ");
		Student s1=new Student(568,"RAM");
		
		s.display();
		s1.change();
		s1.display();
		
	}

}
