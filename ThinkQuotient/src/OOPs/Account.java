package OOPs;

public class Account {
	private int accNo;
	private String ownerName;
	private double balance;
	
	public void setAccno(int accno) {
		accNo=accno;
	}
	public int getAccno() {
		return accNo;
	}
	
	public void setOwnername(String ownername) {
		ownerName=ownername;
	}
	public String getOwnername() {
		return ownerName;
	}
	
	public void setBalance(double Balance) {
		balance=Balance;
	}
	public double getBalance() {
		return balance;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac=new Account();
		ac.setAccno(101);
		ac.setBalance(4532.21);
		ac.setOwnername("Hitendra");
		
		System.out.println(ac.getOwnername()+" - "+ac.getAccno()+" - "+ac.getBalance());
	}

}
