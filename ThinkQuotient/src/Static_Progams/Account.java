package Static_Progams;

public class Account {
	int accNo;
	String userName;
	double balance,interest;
	static double interestRate=0.2;
	
	Account()
	{
		
	}
	Account(int accNo,String userName,double balance)
	{
		this.accNo=accNo;
		this.userName=userName;
		this.balance=balance;
	}
	
	public void calcInterest()
	{
		 interest=balance*interestRate;
	}
	public void show()
	{	calcInterest();
		System.out.println(accNo+"    -   "+userName+"   -  "+balance+"  -  "+interest);
	}
	
	public static void setInterest(double newInterest)
	{
		interestRate=newInterest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac1=new Account(111,"Raj",5000);
		ac1.show();
		Account.setInterest(0.5);
		System.out.println("After changing interest rate:");
		ac1.show();
		
		Account ac2=new Account(222,"amar",10000);
		ac2.show();
		
	}

}
