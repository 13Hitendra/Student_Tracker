package String;

public class Assignment {
	//WAP to split String into 2 tokens where string is "HELLO$WORLD"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="HELLO$WORLD";
		
	//	String[] half = Str.split("\\$");
		
		char[] charArray = Str.toCharArray();
		
		 System.out.println("Array elements:");
	        for (char c : charArray) {
	            System.out.print(c);
	        }
		
	}

}
