package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Student s1=new Student(100,"aaa",56f);
		FileOutputStream fos=new FileOutputStream("C://Users//hacom//git//repository//ThinkQuotient");
	/*	ObjectInputStream ois=new ObjectInputStream();
		
		s1=(Student) ois.readObject();*/
		System.out.println("Object shown");
		
		
	}

}
