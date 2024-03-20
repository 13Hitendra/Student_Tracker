package ArrayAssignment;

import java.util.Scanner;

//Search element from array and show all positions of occurrences.
public class Position {
	static int num;
	
	public static void occure(int []arr) {
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				System.out.print("  "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number to search");
		Position.num=sc.nextInt();
		
		int arr[]= {23,45,67,88,33,45,76,98,45};
		
		occure(arr);
		sc.close();
	}

}
