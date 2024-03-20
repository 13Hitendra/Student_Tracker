package ExceptionH;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo4 {
// try with resources
	public void showdata()
	{
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("myFile.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo4 d= new Demo4();
		d.showdata();
	}

}
