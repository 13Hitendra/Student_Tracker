package TwoD_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPassing {

	public static void setData(int[][]arr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the element");
				int ele=sc.nextInt();
				arr[i][j]=ele;
			}
		}
	}
	
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= new int[2][3];
		ArrayPassing.setData(arr);
		ArrayPassing.display(arr);
	}

}
