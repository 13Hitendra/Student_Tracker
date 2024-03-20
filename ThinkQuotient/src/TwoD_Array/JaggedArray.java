package TwoD_Array;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	
	public static void show(int arr[][])
	{
		for(int i=0;i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] jaggedArray = { {1, 2, 3},{4, 5},{6, 7, 8, 9}};
	     System.out.println("2D jagged Array using first class syntax ");            
	      show(jaggedArray);           
	     
	      System.out.println("2D jagged Array using new keyword syntax ");
	      int arr[][]=new int[4][];
	      Scanner sc=new Scanner(System.in);
	      for(int i=0;i<arr.length;i++)
	      {
	    	  System.out.println("Enter size of "+(i+1)+" row");
	    	  int size=sc.nextInt();
	    	  arr[i]=new int [size];
	    	  
	      }
	      for(int i=0;i<arr.length;i++)
	      {
	    	  for(int j=0;j<arr[i].length;j++) {
	    		  System.out.println("Please enter the data ");
	        		int ele=sc.nextInt();
	        		arr[i][j]=ele;
	    	  }
	      }
	      show(arr);
	}

}
