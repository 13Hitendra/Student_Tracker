package ArrayAssignment;

public class Alternate {
	
	public static void AlternateNumbers(int[] array) {
        
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		AlternateNumbers(arr);
	}

}
