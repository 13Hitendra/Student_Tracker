package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int arr[]=new int [3];
		for(int j=0;j<arr.length;j++)
		{System.out.println("enter number");
			int ele=sc.nextInt();
			arr[j]=ele;
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter The number to Search = ");
		int num=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i])
			{
				found=true;
				break;
			}	
		}
		if(found) {
			System.out.println("number found");
		}
		else {
			System.out.println("not found");
		}
		
		sc.close();
	}

}
