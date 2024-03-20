package ExceptionH;

import java.util.Scanner;

public class Divide {

	public static void divide() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first number");
		int fn = sc.nextInt();

		System.out.println("Enter second number");
		int sn = sc.nextInt();

		try {
			double div = fn / sn;
			System.out.println(div);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("u tried to divid by 0");
		}
		System.out.println("Method ends");
		sc.close();
	}

	public static void main(String[] args) {
		divide();

	}

}
