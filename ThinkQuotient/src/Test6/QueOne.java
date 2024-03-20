package Test6;

import java.util.ArrayList;

class QueOne
{
	public static void Removeduplicate(ArrayList<String>arr)
	{
		for(int i=0;i<arr.size();i++)
		{
			for(int j=i;j<arr.size();j++) 
			{
				if(arr.get(i).equalsIgnoreCase(arr.get(j)))
				{
					arr.remove(j);
				}
			}
		}
	}
	
	public static void main(String[]args)
	{
		ArrayList <String>al=new ArrayList<>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");

			Removeduplicate(al);
			System.out.println(al);

	}

}