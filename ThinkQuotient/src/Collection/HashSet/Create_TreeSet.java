package Collection.HashSet;

import java.util.TreeSet;

public class Create_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>tset=new TreeSet<>();
		tset.add("Benelli");
		tset.add("BMW");
		tset.add("Aprilia");
		tset.add("KAWASAKI");
		tset.add("YAMAHA");
		System.out.println(tset);
		
		System.out.println(tset.first());
		System.out.println(tset.last());
	}

}
