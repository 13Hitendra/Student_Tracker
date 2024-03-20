package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>city=new HashMap<Integer, String>();
		System.out.println(city.put(12,"Pune"));
		city.put(41,"Malegaon");
		city.put(15,"Nashik");
		city.put(1,"Mumbai");
		city.put(13,"Solapur");
		city.put(19,"Jalgaon");
		city.put(45,"Sangola");
		city.put(11,"Satara");
		
		System.out.println(city);
	}

}
