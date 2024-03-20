package Abstraction;

public class User extends Account{
	double interest=0.2;
	public static void main(String[] args) {
		
		Account acc1=new User();
		acc1.deposit(1300.65);
		System.out.println("Balance after deposit = "+acc1.calculate());
		
		acc1.withdraw(1400);
		System.out.println("Balance after Withdraw = "+acc1.calculate());
	}

	@Override
	public double calculate() {
		balance=balance+(balance*interest);
		return balance;
		
	}
}
