package Collection.TreeMap;

import java.util.TreeMap;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>name=new TreeMap<>();
		name.put(1, "Sarita");
		name.put(3, "Pritam");
		name.put(2, "Ram");
		System.out.println(name); 		//maintain ascending order by key.
		
		System.out.println(name.firstKey());
		System.out.println(name.firstEntry());
		
		System.out.println(name.floorEntry(2));
		System.out.println(name.floorKey(6));
	}

}
