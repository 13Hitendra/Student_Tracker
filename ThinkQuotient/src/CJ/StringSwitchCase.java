package CJ;

public class StringSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ch="Divide";
		double num1=10;
		double num2=20;
		double c;
		
		switch(ch) {
			case "Add" :
				c=num1+num2;
				System.out.println("Addition is : "+c);
				break;
				
			case "Substract" :
				c=num1-num2;
				System.out.println("Substraction is : "+c);
				break;
				
			case "Multiply" :
				c=num1*num2;
				System.out.println("Multiplication is : "+c);
				break;
				
			case "Divide" :
				c=(num1/num2);
				System.out.println("Division is : "+c);
				break;
				
		}
				
		
	}

}
