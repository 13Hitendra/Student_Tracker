package ArrayAssignment;

import java.util.Arrays;

public class ArrayReverse {
	public static int[] rev(int []arr)
	{
		int temp,j=arr.length-1;
		for(int i=0;i<arr.length/2;i++)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j--;
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		rev(arr);
		System.out.println(Arrays.toString(arr));
	}

}
