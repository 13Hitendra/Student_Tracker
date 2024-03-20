package Lab;

import java.util.Scanner;

public class FullForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Q7. Print the full form of computer abbreviations 
		like: Wifi	,ram,	cpu  ,sdlc ,	ip*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Write shortform :");
		String str=sc.nextLine();
		
		switch(str) {
			case "wifi" :  System.out.println("wireless fidelity");
				break;
				
			case "ram" : System.out.println("Random Access Memory");
				break;
				
			case "cpu" : System.out.println("Central Processing Unit");
				break;
		}
		sc.close();
	}

}
