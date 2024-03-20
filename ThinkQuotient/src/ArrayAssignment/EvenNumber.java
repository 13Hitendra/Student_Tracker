package ArrayAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class EvenNumber {
	//Show all even numbers from array
	public static void enenNumber(int []arr)
	{
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				
				System.out.println(arr[i]);
			}
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter number ");
			int ele=sc.nextInt();
			arr[i]=ele;
		}
		System.out.println(Arrays.toString(arr));
		
		enenNumber(arr);
		sc.close();
	}

}
