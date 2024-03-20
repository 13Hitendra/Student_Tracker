package Lab;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=25,c=7;
		
		int greatest;
		greatest=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("The greatest number is "+greatest);
	}

}
