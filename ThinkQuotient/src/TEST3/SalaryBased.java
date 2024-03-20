package TEST3;

public class SalaryBased extends Teacher{
	int salary;
	SalaryBased(int salary)
	{
		this.salary=salary;
	}
	public void salary()
	{
		System.out.println("Salary of salary based teacher is = "+salary);
	}

	public static void main(String [] hitendra){
		SalaryBased sb=new SalaryBased(2000);
		sb.salary();
		
	}
}

