package ExceptionH;

public class Assignment_Q14 {
// WAP to check whether Unchecked Exception is propagated in calling stack
	
	public static void a()
	{
		throw new NullPointerException("Exception thrwon in a");
	}
	public static void b()
	{
		a();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{b();}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
