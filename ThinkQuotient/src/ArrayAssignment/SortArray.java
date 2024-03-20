package ArrayAssignment;

import java.util.Arrays;

public class SortArray {
	//Sort array in ascending order
	public static void sort(int [] arr) {
		int l=arr.length;
	
			for(int i=0;i<l;i++) {
				for(int j=i+1;j<l;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {56,32,45,16,8};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
