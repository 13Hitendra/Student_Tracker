package ArrayAssignment;

import java.util.Arrays;

public class MergeArray {
	
	public static int[] merge(int arr[],int arr1[]) {
		
		int merge[]=new int[arr.length+arr1.length];
		for(int i=0;i<arr.length;i++) {
			merge[i]=arr[i];
		}
		for(int j=0;j<arr1.length;j++) {
			merge[j]=arr1[j]; //merge[j+arr.length]=arr[j];
		}
		return merge;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {4,58,93,612,75};
		int arr2[]= {6,7,9,34};
		
		 merge(arr1,arr2);
		 int []mergedArr= merge(arr1,arr2);
		 System.out.println(Arrays.toString(mergedArr));
	}

}
