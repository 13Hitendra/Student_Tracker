package Collection.HashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ArrayList_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>aSet=new ArrayList<String>();
		aSet.add("H2so4");
		aSet.add("C7H9");
		aSet.add("K9P5");
		aSet.add("H2O");
		aSet.add("Br6K");
		
		LinkedHashSet<String>hset=new LinkedHashSet<>(aSet);
		System.out.println(hset);
	}

}
