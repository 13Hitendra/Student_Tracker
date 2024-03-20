package Collection.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String>list=new LinkedList<String>();
		
		list.add("sun");
		list.add("moon");
		list.add("earth");
		list.add("mars");
		list.add("jupitor");
		list.add("saturn");
		
		ListIterator <String>itr=list.listIterator();	//linkedlist created
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(list);
		
		System.out.println(itr.nextIndex());		//ListIterator method
		
		while(itr.hasPrevious())				//reverses whole list
		{
			System.out.println(itr.previous());
		}
		
		itr.set("Neptune");				//sun is removed n replaced by neptune.
		list.set(4, "Andromeda");		//set method with list.   jupitor got replaced
		System.out.println(list);
		
		itr.add("Venus");		//iterator add element at start
		list.add("Pluto");			//element added at last index
		System.out.println(list);
		
		list.remove("mars");			//element removed
		System.out.println(list);
		
		
	}	

}
