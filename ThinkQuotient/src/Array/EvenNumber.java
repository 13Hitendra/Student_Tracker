package Array;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {12,26,15,15,48,59,53,27,56,18};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				System.out.println(arr[i]);
			}
		}sc.close();
	}

}
