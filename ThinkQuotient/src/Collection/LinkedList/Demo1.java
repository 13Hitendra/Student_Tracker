package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> li= new LinkedList<>();
		
		li.add("Sushant");
		li.add("Prashant");
		li.add("Radha");
		li.add("Akash");
		li.add("Ram");
		li.addFirst("Ankita");
		li.addLast("Ajay");
		li.set(3, "Meena");
		System.out.println(li);
		
		li.remove("Prashant");
		li.remove(2);
		System.out.println(li);
		
		li.offerFirst("Sagar");
		li.offer("Priya");
		System.out.println(li);
		
		//ListIterator
		ListIterator <String> itr=li.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
	}

}
