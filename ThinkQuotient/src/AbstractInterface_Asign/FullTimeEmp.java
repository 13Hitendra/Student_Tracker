package AbstractInterface_Asign;

public class FullTimeEmp extends Employee {

	FullTimeEmp(String name, int id, float hrs) {
		super(name, id, hrs);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	double calcSalary() {
		return hrs*500;
		
	}

}
