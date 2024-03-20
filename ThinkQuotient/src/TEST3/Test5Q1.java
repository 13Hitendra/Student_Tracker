package TEST3;

public class Test5Q1 {

	public static void max(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
			System.out.println("max num in row = " + max);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 22, 31, 9 }, { 12, 25, 16 } };
		max(arr);
	}
}
