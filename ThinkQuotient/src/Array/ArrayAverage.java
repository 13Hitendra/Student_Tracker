package Array;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,89,23,56,48,16,23};
		int sum=0,avg=0;
		for(int i=0;i<arr.length;i++)
		{
			 sum=sum+arr[i];
			 avg=sum/arr.length;
			
		}
		 System.out.println(avg);
	}

}
