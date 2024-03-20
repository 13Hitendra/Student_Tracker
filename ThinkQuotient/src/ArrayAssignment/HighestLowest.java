package ArrayAssignment;

public class HighestLowest {
	
	public static void highest(int[]arr)
	{
		int high=0;
	for(int i=0;i<arr.length;i++) {
			
			if(high<arr[i])
			{
				high=arr[i];
			}
		}System.out.println("Highest number = "+high);
	}
	
	public static void lowest(int[]arr)
	{
		int low=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(low>arr[j])
			{
				low=arr[j];
			}
		}System.out.println("Lowest number = "+low);
	}
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,56,89,45,56,35,6,8};
		highest(arr);
		lowest(arr);
	}

}
