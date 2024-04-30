package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo2 {
	public void demo() throws IOException {
		File f3 = new File("C://Users//hacom//OneDrive//Documents");
		String path = "C://Users//hacom//OneDrive//Documents";
		System.out.println(f3.isDirectory() ? "yes directory" : "No directory");
		System.out.println(f3.isFile() ? "yes it is file" : "no it is not file");
		System.out.println(f3.length());
		System.out.println(f3.listFiles());

		File[] files = f3.listFiles();
		System.out.println("------------------------------------------------------");
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
					System.out.println(file.getName());
				} else {
					
				}
			}
		}
		System.out.println("-----------------------------file reading------");
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("C://Users//hacom//OneDrive//Desktop//thinkQuotient//primerange.txt");
			int data=0;
			while((data=fin.read())!=-1)
				System.out.print((char)data);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			fin.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d = new Demo2();
		try {
			d.demo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
