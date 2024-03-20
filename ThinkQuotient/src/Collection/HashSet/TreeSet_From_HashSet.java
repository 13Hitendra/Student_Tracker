package Collection.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet_From_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>color=new HashSet<>();
		color.add("White");
		color.add("Grey");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		
		TreeSet <String>tset=new TreeSet<>(color);
		System.out.println(tset);
	}

}
