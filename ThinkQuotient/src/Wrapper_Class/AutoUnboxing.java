package Wrapper_Class;

public class AutoUnboxing {
	public static void main(String[] args) {
		
		Byte B = 10;
		byte b = B;
		
		Short S = 15;
		short s = S;
		
		Integer I = 20;
		int i = I;
		
		Long L = (long) 25;
		long l = L;
		
		Float F = (float) 26.54;
		float f = F;
		System.out.println(f);
		System.out.println(F);
		
		Double D = 18.59;
		double d = D;
		
		Boolean BLN = true;
		boolean bln = BLN;
		
		Character C = 'w';
		char c = C;
		
		//unwrapping
		Character p = new Character('C'); 
		char P = p.charValue(); 
		System.out.println(P);
		
	}
}
