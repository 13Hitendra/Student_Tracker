package ArrayAssignment;
//Show occurrence of each element.
public class Occurance {
	
	public static void position(int[]arr) {
		
		for(int i=0;i<arr.length;i++)
		{
			boolean status=false;
			for(int k=i-1;k>=0;k--) {
				if(arr[i]==arr[k]) {
					status=true;
					break;
				}
			}
			if(!status)
			{
				int count=1;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
					{
						count++;
					}	
				}System.out.println(arr[i]+"--->"+count);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,2,3,2,1,3,4};
		position(arr);
	}

}
