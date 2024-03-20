package ExceptionH;

import java.util.Arrays;

public class Demo1 {

	public static void show()
	{
		try
		{
			int arr[]= {1,2,3,4,5};
			arr[6]=10;
			System.out.println(Arrays.toString(arr));
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		System.out.println("Method ends");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1.show();
	}

}
