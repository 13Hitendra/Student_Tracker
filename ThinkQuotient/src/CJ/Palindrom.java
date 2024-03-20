package CJ;

public class Palindrom {
	int num,temp,sum,last;
	
	public void checkNum(int val)
	{
		num=val;
	}
	
	public void palindrom()
	{
		temp=num;
		while(num>0)
		{
			last=num%10;
			sum=(sum*10)+last;
			num=num/10;
		}
		if (temp==sum) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("it is not palindrom");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom p=new Palindrom();
		p.checkNum(12341);  //12321
		p.palindrom();
	}

}
