package TwoD_Array;
//add 2 2d matrix and store it in 3rd array.
public class MatrixAddition {
	
	public static int [][] addition(int arr1[][],int arr[][])
	{
		int addition[][]=new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				addition[i][j]=arr1[i][j]+arr[i][j];
			}
		}
		return addition;	
	}
	
	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
			}	System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{5,2,2},{7,5,3},{1,8,5}};
		
		int holdArr[][]=MatrixAddition.addition(arr1, arr2);
		MatrixAddition.display(holdArr);
	}

}
