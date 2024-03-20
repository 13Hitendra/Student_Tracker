package String;

public class Password_Exception extends Exception{

	String pass;
	Password_Exception()
	{
		
	}
	  
	public Password_Exception(String pass)
	{
		this.pass=pass;
	}

}
