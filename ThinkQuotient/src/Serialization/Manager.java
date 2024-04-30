package Serialization;

public class Manager extends Employee {
	double bonus;
public Manager(int empId, String empName, double salary,double bonus) {
		super(empId, empName, salary);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}


public double getBonus() {
	return bonus;
}

public void setBonus(double bonus) {
	this.bonus = bonus;
}


@Override
public String toString() {
	return super.toString()+"Manager [bonus=" + bonus + "]";
}

}
