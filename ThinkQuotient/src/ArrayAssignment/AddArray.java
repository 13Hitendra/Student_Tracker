package ArrayAssignment;

import java.util.Arrays;

public class AddArray {
	public static void addArr(int add[],int arad[])
	{
		int sum[]=new int[add.length];
		for(int i=0;i<add.length;i++)
		{
			sum[i]=add[i]+arad[i];
		}
		System.out.println(Arrays.toString(sum));
		//return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {12,234,55,6};
		int arr2[]= {78,45,12,3};
		addArr(arr1,arr2);
		
	}

}
