package ExceptionH;

public class CustomBinaryException extends Exception {
	int number;
	
	public CustomBinaryException() {
		
	}
	
	public CustomBinaryException(int number) {
		
		this.number = number;
	}

	public String toString() {
		return number+" is not binary number";
	}


}