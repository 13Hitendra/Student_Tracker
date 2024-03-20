package Collection.ArrayList;

import java.util.ArrayList;

public class MatchCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>coll1=new ArrayList<>();
		coll1.add(12);
		coll1.add(15);
		ArrayList<Integer>coll2=new ArrayList<>();
		coll2.add(12);
		coll2.add(15);
		
		System.out.println("Both collections match = "+coll1.equals(coll2));
	}

}
