package Mid_Test;

import java.util.Arrays;

public class SumOfEvenNum {

	public static int SumEven(int arr[])
	{
		int sum=0;
		for(int num : arr)
		{
			if(num%2==0)
			{
				sum=sum+num;
			}
		}return sum;
	}
	
	public static int SecondMax(int arr[])
	{
		int secondmax=0;
		
		for(int i=0;i<arr.length;i++) {
			
		}
			Arrays.sort(arr);
			
		
		
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("Sum of even number in array = "+SumEven(arr));
	}

}
