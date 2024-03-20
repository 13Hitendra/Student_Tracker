package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Student_Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Double>s=new HashMap<>();
		
		s.put("sanket", 88.36);
		s.put("Nishant", 76.54);
		s.put("sagar", 46.36);
		s.put("Hitendra", 75.36);
		System.out.println(s);
		
		//key set and iterator
		System.out.println("map iteration using Keyset() and iterator");
		Set<String>set= s.keySet();
		Iterator<String>itr=set.iterator();
		while(itr.hasNext())
		{
			String i=itr.next();
			System.out.println(i+" : "+s.get(i));
		}
		//entryset and iterator
		System.out.println("map iteration using entryset() and iterator");
		Set<Entry<String, Double>>entry=s.entrySet();
		Iterator<Entry<String, Double>>itr1=entry.iterator();
		while(itr.hasNext())
		{
			Entry<String, Double>en=itr1.next();
			System.out.println(en.getKey()+"  :  "+en.getValue());
		}
		System.out.println("---------------------");
		//entryset and enhanced for loop
		for(Entry<String, Double> e : entry)
		{
			System.out.println(e.getKey()+"  :  "+e.getValue());
		}
		
	}

}
