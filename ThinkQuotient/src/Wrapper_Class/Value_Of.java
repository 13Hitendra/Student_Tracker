package Wrapper_Class;

public class Value_Of {
	public static void main(String[] args) {
		Byte B = Byte.valueOf("10110", 2); // A number with base 2 is converted into decimal value
		System.out.println(B); // Output : 22
		
		B = Byte.valueOf("43", 5); // A number with base 5 is converted into decimal value
		System.out.println(B); // Output : 23
		
		Short S = Short.valueOf("12043", 8); // A number with base 8 is converted into decimal value
		System.out.println(S); // Output : 5155
		
		S = Short.valueOf("4751", 10); // A number with base 10 is converted into decimal value
		System.out.println(S); // Output : 4751
		
		Integer I = Integer.valueOf("4673AB", 12); // A number with base 12 is converted into decimal value
		System.out.println(I); // Output : 1132403
		
		I = Integer.valueOf("6489CDF", 16); // A number with base 16 is converted into decimal value
		System.out.println(I); // Output : 105422047
		
		Long L = Long.valueOf("GHFTDJ", 36); // A number with base 36 is converted into decimal value
		System.out.println(L); // Output : 996750199
		
		L = Long.valueOf("DFGCHJ", 36); // A number with base 36 is converted into decimal value
		System.out.println(L); // Output : 812017207
	}
}
