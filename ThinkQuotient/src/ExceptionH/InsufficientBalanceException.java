package ExceptionH;
//account
public class InsufficientBalanceException extends Exception {
	double balance;
	
	public InsufficientBalanceException() {
		
	}
	
	public InsufficientBalanceException(double balance) {
		
		this.balance = balance;
	}

	public String toString() {
		return balance+" rs less in ur account";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
