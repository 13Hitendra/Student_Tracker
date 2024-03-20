package ArrayAssignment;

import java.util.Arrays;

//Replace all negative elements by ZEROS.
public class Replace {
	public static void Replace_Zero(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,-8,3,4,-7};
		Replace_Zero(arr);
	}

}
