package ExceptionH;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent{
	// in super class if method throws exception declare that exception as 
	//Exception cause in child class we may get other exceptions also
	public void show()throws IOException
	{
		System.out.println("in parent show");
	}
}

public class InheritedException extends Parent{
	
	public void show()throws FileNotFoundException,IOException
	{//in child class u compulsory mension super class exception n then can throw subtype of it
		super.show();
		System.out.println("in child show");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritedException gh=new InheritedException();
		try {
			gh.show();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
