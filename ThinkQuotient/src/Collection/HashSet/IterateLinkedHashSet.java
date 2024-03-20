package Collection.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IterateLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>hSet=new LinkedHashSet<>();
		
		hSet.add("H2so4");
		hSet.add("C7H9");
		hSet.add("K9P5");
		hSet.add("H2O");
		hSet.add("Br6K");
		
		//iterate through iterator
		Iterator<String>itr=hSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
