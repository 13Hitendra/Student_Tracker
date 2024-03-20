package Collection.LinkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class MaxCopy {
//create a book object as key and store book name id and price in it then Integer as value(number of copies)
	// n show book with max number of copies. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Book,Integer>bookset=new LinkedHashMap<>();
		bookset.put(new Book(101, "Java", 120.50), 50);
		bookset.put(new Book(102, "JavaScript", 500.50), 45);
		bookset.put(new Book(103, "Python", 368.92), 100);
		bookset.put(new Book(104, "HTML", 452.46), 86);
		
		Book maxCopy=null;
		int maxcopies=Integer.MIN_VALUE;
		
		for(Map.Entry<Book, Integer>entry:bookset.entrySet())
		{
			if(entry.getValue()>maxcopies)
			{
				maxcopies=entry.getValue();
				maxCopy=entry.getKey();
			}
		}
		
		if(maxCopy!=null)
		{
			System.out.println("Max copies of book is "+maxCopy+"  with  "+maxcopies+" copies");
		}
	}

}
