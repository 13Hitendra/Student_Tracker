package TwoD_Array;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=3;
		arr[1][1]=4;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"  ");	
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		int arr1[][]= {{2,3},{3,4},{4,5},{6,7}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-------------------");
//addition of 2d array element
		int arr2[][]= {{2,3},{3,4},{4,5},{6,7}};
		int sum=0;
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				 sum=sum+arr2[i][j];
			}
		}System.out.println(sum);
	}

}
