package Test6;

import java.util.LinkedList;
import java.util.ListIterator;

class RevOrder
{
	public static void main(String [] hitendra)
	{
		LinkedList<String>link=new LinkedList<>();
		link.add("mouse");
		link.add("keyboard");
		link.add("cpu");
		link.add("monitor");

		ListIterator<String>itr=link.listIterator();

		System.out.println("traverse in reverse");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}
}