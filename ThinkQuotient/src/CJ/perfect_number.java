package CJ;

import java.util.Scanner;

public class perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for (int i=1;i<num/2;i++) {
			if (num%1==0) {
				sum=sum+i;
			}
			if(sum==num) {
				System.out.println("This is perfect number");
			}
			else {
				System.out.println("This is not perfect number.");
			}
		}
	}
   
}
