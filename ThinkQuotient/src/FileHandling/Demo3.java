package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

	public void writeFile() throws IOException
	{
		FileOutputStream fout=new FileOutputStream(new String("C://Users//hacom//OneDrive//Desktop//thinkQuotient//Notes//FiileHandling//Mynewfile.txt"));
		String str="thinkquotient software pvt ltd";
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			fout.write(c);
		}
		fout.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3 d=new Demo3();
		try {
			d.writeFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
