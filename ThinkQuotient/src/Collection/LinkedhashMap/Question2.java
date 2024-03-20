package Collection.LinkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;
//WAP to create a LinkedHashMap. Add 3 objects in it.
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String>answer=new LinkedHashMap<>();
		
		answer.put(12, "Alphabet");
		answer.put(56, "Words");
		answer.put(49, "Sentence");
		answer.put(16, "Phrase");
		
		for(Map.Entry<Integer, String>entry : answer.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	}

}
