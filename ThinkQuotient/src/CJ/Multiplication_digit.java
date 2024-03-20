package CJ;

public class Multiplication_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 1243;
		int prod=1;
		
		while (num>0) {
			int digit = num%10;
			prod=prod*digit;
			num=num/10;
		}
		System.out.println(prod);
	}

}
