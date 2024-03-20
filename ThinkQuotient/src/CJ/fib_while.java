package CJ;

import java.util.Scanner;

public class fib_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		int fno=0,sno=1,tno,terms;
		System.out.println("Enter terms :");
		terms=sc.nextInt();
		System.out.println(fno+" "+sno);
		int num=1;
		while(num<terms) {
			tno=fno+sno;
			System.out.println(" "+tno);
			fno=sno;
			sno=tno;
			terms++;
		}
	}

}
