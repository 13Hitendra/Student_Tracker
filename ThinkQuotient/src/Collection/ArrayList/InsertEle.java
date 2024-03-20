package Collection.ArrayList;

import java.util.ArrayList;

public class InsertEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> Alpha=new ArrayList<>();
		 Alpha.add("a");
		 Alpha.add("b");
		 Alpha.add("c");
		 Alpha.add("d");
		 
		 System.out.println("ArrayList = "+Alpha);
		 
		 String insert="z";
		 Alpha.add(0, insert);
		 System.out.println("After insert = "+Alpha);
		 
	}

}
