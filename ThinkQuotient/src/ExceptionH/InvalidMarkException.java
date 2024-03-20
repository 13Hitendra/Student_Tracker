package ExceptionH;

public class InvalidMarkException extends Exception {

	 static int marks;
	public InvalidMarkException()
	{
		
	}
	public InvalidMarkException(int m)
	{
		marks=m;
	}
	public String toString()
	{
		return marks+"  are invalid marks";
	}
	
	

}
