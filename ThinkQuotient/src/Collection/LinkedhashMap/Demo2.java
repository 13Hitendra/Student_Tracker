package Collection.LinkedhashMap;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Integer,String>lmap=new LinkedHashMap<>();
		lmap.put(101,"Priya");
		lmap.put(105,"Dhaani");
		lmap.put(109,"Rupali");
		
		Set<Entry<Integer,String>>set=lmap.entrySet();
		Iterator<Entry<Integer,String>>itr=set.iterator();
		int max=0;
		String str=null;
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Entry<Integer,String>e=itr.next();
			Integer i=e.getKey();
			if(i>max)
			{
				max=i;
				
			}
		}
		
	}

}
