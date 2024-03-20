package Collection.Map;

import java.util.HashMap;

public class KeyDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>duplicate=new HashMap<>();
		
		duplicate.put(1, "Python");
		
		
		System.out.println(duplicate.put(2, "c")); 
		
		
		System.out.println(duplicate.put(3, "c++")); 
		
		
		duplicate.put(1, "html");
		
		
		System.out.println(duplicate.put(3, "css"));
		
	}

}
