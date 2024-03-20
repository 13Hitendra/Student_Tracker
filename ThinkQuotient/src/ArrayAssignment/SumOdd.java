package ArrayAssignment;
//Show sum of all odd elements from array
public class SumOdd {
	public static void sumOdd(int []arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				sum=sum+arr[i];
			}
		}System.out.println("Sum of odd elements = "+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,53,74,32,45,98};
		sumOdd(arr);
	}

}
