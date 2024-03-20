package CJ;

public class Armstrong_Instance {
	int num,sum;
	
	public void setNum(int value) {
		num=value;
	}
	
	public void armstrong() {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong_Instance ai=new Armstrong_Instance();
		ai.setNum(1635); //1634
		ai.armstrong();
	}

}
