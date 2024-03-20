package CJ;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1635,sum=0;			//153,1634 is armstrong no.
		int temp=num;
		
		while(num>0) {
			int last=num%10;
			sum=(sum)+(last*last*last*last);//multiplying digit 
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("The number is Armstrong.");
		}
		else {
			System.out.println("It's Not Armstrong number.");
		}
	}
}
