package Array;
/*Show highest/lowest element from array.*/
public class High_Low {

	public static void main(String[] args) {
		
		int arr[]= {12,56,89,45,6,23,65,87};
		int high=0;
		int low=arr[0];
		for(int i=0;i<arr.length;i++) {
			
			if(high<arr[i])
			{
				high=arr[i];
			}
		}System.out.println("Highest number = "+high);
		
		for(int j=1;j<arr.length;j++)
		{
			if(low>arr[j])
			{
				low=arr[j];
			}
		}System.out.println("Lowest number = "+low);
	}

}
