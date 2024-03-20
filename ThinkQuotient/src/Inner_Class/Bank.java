package Inner_Class;

public class Bank {

	int id;
	String name;

	Bank() {
	}

	Bank(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void showDetail() {
		System.out.println("User name : " + name);
		System.out.println("User id : " + id);
	}

	class Locker {
		int lockerNumber;
		String password;

		Locker(String password, int lockerNumber) {
			this.lockerNumber = lockerNumber;
			this.password = password;
		}

		public void lockerDetail() {
			showDetail();
			System.out.println("Locker NUmber : " + lockerNumber);
			System.out.println("Password : " + password);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank("Jay", 101);
		Locker l = b.new Locker("asdf1234", 123);
		l.lockerDetail();
		
	}

}
