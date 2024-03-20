package Collection.HashSet;

import java.util.HashSet;

public class Array_From_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>color=new HashSet<>();
		color.add("White");
		color.add("Grey");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		System.out.println(color);
		
		String[] arr=color.toArray(new String[color.size()]);	//color.size() -cause array is fixed in size
		
		for(String element:arr)
		{
			System.out.println(element);
		}
	}

}
