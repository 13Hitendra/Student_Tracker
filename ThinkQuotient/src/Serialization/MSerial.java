package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MSerial implements Serializable {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
		Manager m=new Manager(1,"Jay",1200,5000);
		
		FileOutputStream fos= new FileOutputStream("C://Users//hacom//OneDrive//Desktop//thinkQuotient//Employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println(m);
		
		FileInputStream fis=new FileInputStream("C://Users//hacom//OneDrive//Desktop//thinkQuotient//Employee.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		m=(Manager) ois.readObject();
		System.out.println(m);
		ois.close();
		fis.close();
		                             
		
	}

}
