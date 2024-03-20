package Lab;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Give the discount on the bill if bill>10000
		 * disc=bill*10.0/100   else bill*5.0/100*/
		
		double bill=9000;
		double disc=(bill>=10000)?(bill*0.1):(bill*0.05);
		System.out.println("Discount on your bill is "+disc);
		
	}

}
