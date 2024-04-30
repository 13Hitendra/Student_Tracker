package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo1 {
	
	public void demo() throws IOException {
		File f=new File("C://Users//hacom//OneDrive//Desktop//thinkQuotient//primerange.txt");
		System.out.println("File name -"+f.getName());
		System.out.println("File Path -"+f.getPath());
		System.out.println("File Absolute Path -"+f.getAbsolutePath());
		System.out.println("File parent -"+f.getParent());
		System.out.println(f.exists()?"yes exist":"no exist");
		System.out.println(f.canRead()?"yes read":"cant read");
		System.out.println("File last modified -"+f.lastModified());
		System.out.println("File length - "+f.length());
		
		
		/*File f1=new File("C://Users//hacom//OneDrive//Desktop//thinkQuotient//Notes//FiileHandling//filecreate.txt");
		f1.createNewFile();
		
		File f2=new File("C://Users//hacom//OneDrive//Desktop//thinkQuotient//Notes//FiileHandling//foldercreate");
		f2.mkdir();*/
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		try {
			d.demo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
