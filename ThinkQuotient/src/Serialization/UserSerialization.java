package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class UserSerialization {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
	/*	Date d1=new Date("09-2022");
		User u1=new User("Akshit","1234@asdf","akshit@gmail",d1);	*/
		
		User[]arr=new User[3];
		
		arr [0]=new User("Akshit","asd123","Akshit@gmail",new Date("09-2022"));
		arr [1]=new User("gaurav","poi345","gaurav@gmail",new Date("11-2023"));
		arr [2]=new User("rahul","asd123","rahul@gmail",new Date("02-2023"));
		
		FileOutputStream fos=new FileOutputStream("C://Users//hacom//OneDrive//Documents//UserSerial.txt");
		
	}

}
