package Test8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveThree{
	
	public static void main(String []asdf){
		HashMap<Integer,String>map=new HashMap<>();
		map.put(1,"One");
		map.put(2,"Two");
		map.put(3,"Three");
		map.put(4,"Four");
		map.put(5,"Five");
		map.put(6,"Six");
		map.put(7,"Seven");
		map.put(8,"Eight");
		map.put(9,"Nine");
		map.put(10,"Ten");

		for(int i=0; i<=10; i++)
		{
			if(i%3==0)
			{
				map.remove(i);
			}
		}
		Iterator<Map.Entry<Integer,String>>iterator=map.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer,String>entry=iterator.next();
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}

	}
}
