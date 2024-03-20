package Collection.HashSet;

import java.util.HashSet;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>color=new HashSet<>();
		color.add("White");
		color.add("Grey");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		
		for(String c : color)
		{
			System.out.println(c);
		}
	}

}
