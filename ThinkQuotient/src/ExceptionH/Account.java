package ExceptionH;

import java.util.Scanner;
//get exception insufficientbalance from user


public class Account extends InsufficientBalanceException {

	int id;
	String UserName;
	double balance;
	
	public Account(int id, String userName,double balance) {
		super();
		this.id = id;
		UserName = userName;
		this.balance=balance;
	}
	
	public void Deposit()
	{
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter amount to deposit ");
		double deptamt=Sc.nextDouble();
		balance=balance+deptamt;
	}
	public void Withdraw() throws InsufficientBalanceException
	{
		Scanner Sc=new Scanner(System.in);
		
		System.out.println("Enter amount to Withdraw ");
		double Wdamt=Sc.nextDouble();
		balance=balance-Wdamt;
		if(balance<Wdamt)
		{
			throw new InsufficientBalanceException(balance);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account(12,"Raju",12000);
		try {
			ac.Withdraw();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
