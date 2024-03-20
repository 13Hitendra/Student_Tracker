package CJ;

import java.util.Scanner;

public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter num. of rows :");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=i;j<=n;j++) {
				System.out.print("   ");
				
				}
			for (int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
