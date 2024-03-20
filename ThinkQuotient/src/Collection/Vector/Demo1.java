package Collection.Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer>v=new Vector<Integer>();
		
		v.add(12);
		v.add(45);
		v.add(87);
		v.add(2, 23);
		System.out.println(v);
		
		System.out.println(v.contains(23));
		
		System.out.println(v.elementAt(3));
		
		System.out.println(v.firstElement());
		
		System.out.println(v.indexOf(45));
		
		System.out.println("--------------------------------------");
		
		 Iterator<Integer> iterator = v.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	        System.out.println("-----------------------------------------");
	        
	        Enumeration <Integer>en=v.elements();
	        while(en.hasMoreElements())
	        {
	        	System.out.println(en.nextElement());
	        }
	}

}
