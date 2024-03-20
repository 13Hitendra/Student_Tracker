package Test6;

import java.util.ArrayList;
import java.util.Collections;

class Reverse{

	public static void main(String[]afjh)
	{
		ArrayList<String>arr=new ArrayList<>();

		arr.add("java");
		arr.add("python");
		arr.add("Html");
		arr.add("css");

		Collections.sort(arr);
		Collections.reverse(arr);

		for (String str : arr)
		{
			System.out.print(str);
		}

	}
}