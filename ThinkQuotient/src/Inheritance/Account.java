package Inheritance;

public class Account {
	
	int accNo;
	String userName;
	double balance;
	
	Account(){
		balance=0;
	}
	
	Account(int accNo,String userName,double balance)
	{
		this.accNo=accNo;
		this.userName=userName;
		this.balance=balance;
	}
	
	public void deposit(int depAmt)
	{
		balance=balance+depAmt;
		System.out.println("Your Account Balance is = "+balance);
	}
	
	public void withdraw(int drawAmt)
	{
		if (balance>0 )
		{
			balance=balance-drawAmt;
		}
		else
		{
			System.out.println("Insufficient Amount");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Account ac=new Account(121,"Somebody",20000);
	//	ac.deposit(12000);
		//ac.withdraw(13000);
		
	}

}
