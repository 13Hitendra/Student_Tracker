package Collection.HashSet;

import java.util.TreeSet;

public class RemoveLowestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>tset=new TreeSet<>();
		tset.add(2);
		tset.add(4);
		tset.add(7);
		tset.add(5);
		tset.add(44);
		System.out.println(tset);
		
		
		int lowNum=tset.pollFirst();  //gives lowest element in set
		tset.remove(lowNum);		//removes that element
		System.out.println(tset);
		
		
		
	}

}
