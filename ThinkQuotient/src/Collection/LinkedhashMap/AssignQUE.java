package Collection.LinkedhashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AssignQUE {
/*WAP to create a Map with Integer as key and any other object as value.
	Now get a key-value mapping associated with the highest key and the least key in a map*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Car>car=new HashMap<>();
		
		car.put(11,new Car("TATA","s23df"));
		car.put(12,new Car("Hyundai","k10"));
		car.put(13,new Car("Hero","L980"));
		car.put(14,new Car("Mitsubishi","G568"));
		
		int leastKey=Collections.min(car.keySet());
		System.out.println("min key -"+leastKey);
		
		int maxKey=Collections.max(car.keySet());
		System.out.println("Max key -"+maxKey);
		
		//WAP to search a value in the Map.
		String search="G568";
        
        for(Map.Entry<Integer, Car>entry : car.entrySet())
        {
        	if(entry.getValue().getModel()==search)
        	{
        		System.out.println("Car found "+entry.getValue());
        	}
        }
        // WAP to get all keys in the Map.
        for(Integer key : car.keySet())
        {
        	System.out.println(key);
        }
        
        // WAP to remove an element from the Map.
       // int removeEle=13;
        car.remove(13);
        System.out.println(car);
        
	}

}
