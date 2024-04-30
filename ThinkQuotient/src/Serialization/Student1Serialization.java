package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student1Serialization  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Course course1=new Course(112,"Python",12000);
		Student1 s1= new Student1(12,"Ram",56,course1);
		SchoolStudent s2=new SchoolStudent(43,"Suraj",65,new Course(23,"HTML",1400),11);
		
		
		FileOutputStream fos= new FileOutputStream("C://Users//hacom//OneDrive//Documents//Student1.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s2);
		oos.writeObject(course1);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();		
		
		System.out.println("Object saved");
		
		FileInputStream fin=new FileInputStream("C://Users//hacom//OneDrive//Documents//Student1.txt");
		ObjectInputStream ois=new ObjectInputStream(fin);
		System.out.println((SchoolStudent) ois.readObject());
		System.out.println((Course) ois.readObject());
		System.out.println((Student1) ois.readObject());
		ois.close();
		fin.close();
	}

}
