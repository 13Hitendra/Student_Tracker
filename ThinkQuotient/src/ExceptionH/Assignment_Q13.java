package ExceptionH;

public class Assignment_Q13 {
//WAP to check what happen when Exception is thrown by main method

	public static void main(String[] args) {
		try {

			throw new Exception("exception in main method");
		} catch (Exception e) {

			System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
