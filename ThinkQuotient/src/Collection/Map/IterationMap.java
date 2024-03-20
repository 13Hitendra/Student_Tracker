package Collection.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>course=new HashMap<Integer, String>();
		System.out.println(course.put(12,"Pune"));
		course.put(41,"Malegaon");
		course.put(15,"Nashik");
		course.put(1,"Mumbai");
		course.put(13,"Solapur");
		course.put(19,"Jalgaon");
		course.put(45,"Sangola");
		course.put(11,"Satara");
		
		//keyset and iterator
		System.out.println("map iteration using keyset() and iterator");
		
		Set<Integer>set= course.keySet();
		Iterator<Integer>itr=set.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			System.out.println(i+" : "+course.get(i));
		}
		
		//entryset and iterator
		System.out.println("map iteration using entryset() and iterator");
		Set<Entry<Integer,String>>entry=course.entrySet();
		Iterator<Entry<Integer,String>>itr1=entry.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String>en=itr1.next();
			System.out.println(en.getKey()+"  :  "+en.getValue());
		}
		
		//entryset and enhanced for loop
		for(Entry<Integer, String>e : entry)
		{
			System.out.println(e.getKey()+"  :  "+e.getValue());
		}
		
	}

}
