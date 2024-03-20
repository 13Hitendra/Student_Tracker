package String;

public class Password extends Password_Exception {

	public static boolean conditions(String password) {
		// method to check conditions are satisfied or not
		int lCount = 0;
		int uCount = 0;
		int sCount = 0;
		int dCount = 0;

		for (char ch : password.toCharArray()) {

			if (Character.isLowerCase(ch)) {
				lCount++;
			} else if (Character.isUpperCase(ch))
				uCount++;
			else if (Character.isDigit(ch))
				dCount++;
			else if (ch == '#' || ch == '@' || ch == '.')
				sCount++;
		}
		
		if (uCount < 1 || lCount < 1 || dCount < 1 || sCount < 1) {
			return false;
		} else {
			return true;
		}
		
	}
	public static void getHint()
	{
		String pw="";
		
	}

	public static void main(String[] args) throws Password_Exception {
		// TODO Auto-generated method stub
		String password="Sfje_234";
		
		if(password.length()<8 )
		{
			throw new Password_Exception("length of password must be 8") ;
		}
		if(conditions(password))
		{
			throw new Password_Exception("Password must contain [A-Z],[a-z],[0-9][@,#,.]");
		}
		else {
			System.out.println("Password accepted.");
		}
		
	}

}
