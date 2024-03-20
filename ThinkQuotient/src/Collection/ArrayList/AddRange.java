package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AddRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> num=new ArrayList<>();
		int sum=0;
		
		for(int i=0;i<=50;i++)
		num.add(i);
		
		Iterator <Integer>itr=num.iterator();
		while(itr.hasNext())
		{
			int numb=itr.next();
			if(numb%2==0) {
				
				sum=sum+numb;
			}
		}System.out.println("Addition of even num bet 1-50 = "+sum);
		
	}

}
