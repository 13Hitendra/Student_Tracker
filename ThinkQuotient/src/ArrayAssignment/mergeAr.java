package ArrayAssignment;

import java.util.Arrays;
// this logic is applicable only for same sized arrays

public class mergeAr {
	
	public static int[] ma(int[]arr1,int []arr2) {
		int a3[]=new int[arr1.length+arr2.length];
		int j=0;
		for(int i=0;i<arr1.length;i++) {
			a3[j++]=arr1[i];
			a3[j++]=arr2[i];
		}
		
		return a3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {4,58,93,612};
		int arr2[]= {6,7,9,34};
		
		 ma(arr1,arr2);
		 int []mergedArr= ma(arr1,arr2);
		 System.out.println(Arrays.toString(mergedArr));
	}

}
