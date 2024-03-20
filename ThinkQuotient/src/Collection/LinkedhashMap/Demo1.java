package Collection.LinkedhashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String>hmap=new HashMap<>();
		hmap.put(101,"Ajay");
		hmap.put(103,"Abhi");
		hmap.put(102,"Rahul");
		System.out.println(hmap);
		
		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<>();
		lmap.put(101,"Ajay");
		lmap.put(103,"Abhi");
		lmap.put(102,"Rahul");
		System.out.println(lmap);
	}

}
