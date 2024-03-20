package String;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Python";
		String s2="JavaScript";
		
		System.out.println(str.length());

		System.out.println(str.compareTo(s2));
		
		System.out.println(str.endsWith("on"));
		
		System.out.println(str.charAt(0));

		System.out.println(str.substring(1));

		System.out.println(str.replace('P', 't'));
		
		System.out.println(str.substring(1, 3));
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(str.equalsIgnoreCase("php"));
		
		System.out.println(str.startsWith("Py"));
	}

}
