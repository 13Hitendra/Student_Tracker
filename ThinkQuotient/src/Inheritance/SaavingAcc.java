package Inheritance;

public class SaavingAcc extends Account {
	double interestRate;
	String panNo;
	
	SaavingAcc(){
		interestRate=0.2;
	}
	
	SaavingAcc(int accNo,String userName,double balance,double rate,String pan)
	{
		super(accNo,userName,balance);
		this.interestRate=rate;
		this.panNo=pan;
	}
	
	public void checkBalance()
	{
		balance=balance+(balance*interestRate);
		System.out.println("Account Number = "+accNo);
		System.out.println("User Name            =  "+userName);
		System.out.println(" Account balance with interest : "+balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaavingAcc sa=new SaavingAcc(111,"me",12000,0.3,"BVQPC4562D");
		sa.deposit(2300);
	//	sa.withdraw(1000);
		sa.checkBalance();
			
		System.out.println("----------------------------------------------");
		SaavingAcc sa1=new SaavingAcc(121,"you",0,0.3,"asdf");
		sa1.withdraw(120);
		sa1.checkBalance();
	}

}
