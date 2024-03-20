package Collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayList_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>color=new ArrayList<>();
		color.add("White");
		color.add("Grey");
		color.add("Blue");
		color.add("Green");
		color.add("Yellow");
		color.add("Red");
		
		for(String ah:color)
		{
			System.out.println(ah);
		}
		
		HashSet<String>hset=new HashSet<>(color);
		
		System.out.println("HashSet from ArrayList : ");
        Iterator<String> iterator = hset.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}

}
