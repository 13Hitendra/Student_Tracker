package TwoD_Array;

import java.util.Scanner;

public class RowAddition {

	public static void setData(int arr[][])
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			int ele;
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter number ");
				ele=sc.nextInt();
				arr[i][j]=ele;
			}
		}
	}
	
	public static void addRow(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[i][j];
				
			}System.out.println("sum=" +sum);
		}
	}
	
	public static void addColumn(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			int colAd=0;
			for(int j=0;j<arr.length;j++)
			{
				colAd=colAd+arr[j][i];
			}System.out.println("colAD= "+colAd);
			colAd=0;
		}
	}
	
	public static void Diagonal(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i][i]+"  ");
		}
	}
	
	public static void rowColReplace(int arr[][])
	{
		
	}
	
	public static void main(String[] args) {
		
		int arr[][]= new int[3][3];
		RowAddition.setData(arr);
	//	RowAddition.addRow(arr);
		RowAddition.addColumn(arr);
		RowAddition.Diagonal(arr);
		
	}

}
