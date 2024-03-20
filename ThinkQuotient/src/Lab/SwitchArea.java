package Lab;

import java.util.Scanner;

/*9.WAP in java using switch case for following: Area of a circle, Area of a square ,Area of a right angled triangle ,
 * Area of a rectangle ,Circumference of a circle, Perimeter of a square, Accept inputs like radius,side,etc through keyboard.
 */
//Menu driven program using switch case:

public class SwitchArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1=area of circle  2=area of square  3=area of right angle triangle");
		System.out.println("4=area of rectangle 5=circumference of circle  6=perimeter of square");
		System.out.println("choose operation number to bes perform");
		
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1 :
			System.out.println("enter value of radius :");
			double radius=sc.nextInt();
			double aCircle=3.141*(radius*radius);
			System.out.println("Area of circle is :"+aCircle);
			break;
			
		case 2 :
			System.out.println("enter length of side :");
			double length=sc.nextDouble();
			double aSquare=length*length;
			System.out.println("Area of square is :"+aSquare);
			break;
			
		case 3 :
			System.out.println("enter base value :");
			double base=sc.nextDouble();
			System.out.println("enter height value :");
			double height=sc.nextDouble();
			double aRightAtri=0.5*(base*height);
			System.out.println("Area of right angle triangle : "+aRightAtri);
			break;
			
		case 4 :
			System.out.println("Enter length : ");
			double length1=sc.nextDouble();
			System.out.println("enter width :");
			double width=sc.nextDouble();
			double aRect=length1*width;
				System.out.println("Area of Rectangle is :"+aRect);
				break;
				
		case 5 :
			System.out.println("Enter radius :");
			double rad=sc.nextDouble();
			double circumCircle=2*3.145*rad;
			System.out.println("Circumference of circle is : "+circumCircle);
			break;
			
		case 6 :
			System.out.println("Enter Side :");
			double side=sc.nextDouble();
			double pSquare=4*side;
			System.out.println("Perimeter of square = "+pSquare);
			break;
			
			default : System.out.println("Invalid operation selected.");
			
		}
		sc.close();
	}

}
