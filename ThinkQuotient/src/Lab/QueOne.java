package Lab;

import java.util.Scanner;

public class QueOne {
/*Q). generate your own function to satisfy the relationship between the inputs and outputs.
Your task is to create a function that, when fed the inputs below, produce the sample outputs shown.
Examples
832 ➞ 594
51 ➞ 36
7977 ➞ 180
1 ➞ 0
665 ➞ 99
149 ➞ 0*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int digit=0;
		int sum=0;
		
		for(int i=num;i>0;i=i/10) {
			digit=i%10;
			sum=sum*10+digit;
		}
		int res=num-sum;
		if(res>0) {
			System.out.println(res);
		}
		else {
			System.out.println(0);
		}
		
	}

}
