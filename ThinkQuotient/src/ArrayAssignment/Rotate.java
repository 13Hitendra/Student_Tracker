package ArrayAssignment;

import java.util.Arrays;

//Right rotate array by one position Eg. {4,5,6,7} after right rotate will become {7,4,5,6}

public class Rotate {
	public static void rotate(int []arr) {
		
		
		int last=arr[arr.length-1];
		
		for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  
            
		}
		arr[0]=last;		//this should not on up
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,14,15};
		rotate(arr);
	}

}
