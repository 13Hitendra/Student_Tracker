package Array;

//import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int arr[]= {6,7,8,9};
		System.out.println(arr.length);
		int k=arr.length-1;
		
		for(int i=k;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
