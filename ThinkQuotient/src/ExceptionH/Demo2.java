package ExceptionH;

public class Demo2 {
	public static void main(String[] args) {
		try {

	/*		String str = null;
			System.out.println("string length is " + str.length());	*/

			int dividend = 10;
			int divisor = 0;
			int result = dividend / divisor;
			System.out.println("Result of division: " + result);
		}

/*		catch(NullPointerException |ArithmeticException ex)		//can write like this also
		{																				
			System.out.println(ex);
		}*/
		catch (NullPointerException e) {
			System.out.println("Caught NullPointerException: " + e.getMessage());
		} 
		catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		

	}
}
