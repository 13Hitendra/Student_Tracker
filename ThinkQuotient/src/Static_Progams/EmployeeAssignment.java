package Static_Progams;
/*1>Write a class Employee with following datamember
id,name,salary
write appropriate constructors ,showData method.
Note : id should be autogenerated . 
Hint use static coounter datamember.*/


public class EmployeeAssignment {
	//static int id;
	 int id;
	String name;
	double salary;
	static int count=1;
	
	EmployeeAssignment()
	{
		id=count++;
		//System.out.println(id);
	}
	
	EmployeeAssignment(String n,double s)
	{	
		this();
		this.name=n;
		this.salary=s;
	}
	
	public void showData()
	{
		System.out.println(id+"  "+name+"  "+salary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAssignment ea= new EmployeeAssignment();
		ea.name="somebody";
		ea.salary=12345;
		ea.showData();
		
		EmployeeAssignment ea1= new EmployeeAssignment("Anybody",98745);
		ea1.showData();
		ea.showData();
	
		
	}

}
