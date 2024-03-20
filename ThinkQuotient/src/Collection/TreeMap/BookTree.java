package Collection.TreeMap;

import java.util.TreeMap;

public class BookTree implements Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Book,Integer>bookSet=new TreeMap<>();
		bookSet.put(new Book(1, "java", 120.3), 12);
		System.out.println(bookSet); 	// gives classcastexception 
		
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
