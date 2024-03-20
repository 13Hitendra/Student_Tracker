package Collection.ArrayList;

import java.util.ArrayList;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> num=new ArrayList<>();
		
		num.add(48);
		num.add(46);
		num.add(2);
		num.add(23);
		
		int find=2;
		
		for(int no : num)			// can use boolean to find and then put it in if else to print
		{
			if(no==find)
			{
				System.out.println("number found");
				break;
			}
		}
		
	}

}
