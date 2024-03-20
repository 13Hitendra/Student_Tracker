package AbstractInterface_Asign;

public class partTimeEmp extends Employee{

	partTimeEmp(String name, int id, float hrs) {
		super(name, id, hrs);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcSalary() {
		 return hrs*200;
		
	}

}
