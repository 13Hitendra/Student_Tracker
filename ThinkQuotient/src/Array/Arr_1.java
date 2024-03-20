package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[4];
		arr[0]=12;
		arr[1]=14;
		arr[2]=16;
		arr[3]=18;
		System.out.println("Array length is = "+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		
		System.out.println();
	//	int a2[]= {23,24,25,26};
		System.out.println();
		
		int a3[]=new int [3];
		for(int j=0;j<a3.length;j++)
		{System.out.println("enter number");
			int ele=sc.nextInt();
			a3[j]=ele;
		}
		System.out.println(Arrays.toString(a3));
		sc.close();
	}

}
