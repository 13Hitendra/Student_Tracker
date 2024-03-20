package TEST3;
/* Arr = { { 1,2,3,4} , {5,6,7,8}}
 * convert to =>
 * ArrCopy = {{4,3,2,1} , { 8,7,6,5}
 */

public class Test5Q2 {

	public static int[][] reverse(int arr[][]) {
		int[][] arrCopy = new int[arr.length][arr[0].length];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arrCopy[i][j] = arr[i][arr[i].length - 1 - j];
			}
		}

		return arrCopy;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (j < arr[i].length - 1) {
					System.out.print(arr[i][j] + ", ");
				} else {
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		int arrCopy[][] = reverse(arr);
		printArray(arrCopy);
	}

}
