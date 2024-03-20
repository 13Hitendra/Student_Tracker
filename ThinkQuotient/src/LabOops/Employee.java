package LabOops;
/*9. Create one class Employee (emp_id, name, sal) with private access specifier and create getter and setter. 
 * Create 2 object s
•	One  by default  constructor and then set data using setters
•	Create second object by parameterized constructor.
•	Call display on both objects
*/
public class Employee {
	private int emp_id;
	private String name;
	private double sal;
	
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;		
	}
	public int getEmp_id()
	{
		return emp_id;
	}
	
	public void setName(String name)
	{
		this.name=name;		
	}
	public String getName()
	{
		return name;
	}
	
	public void setSal(double sal)
	{
		this.sal=sal;		
	}
	public double getSal()
	{
		return sal;
	}
	
	Employee()
	{
		System.out.println("default const.");
	}
	Employee(int emp_id,String name,double sal)
	{
		System.out.println("Parameterised Const:");
		this.emp_id=emp_id;
		this.name=name;
		this.sal=sal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setEmp_id(101);
		e1.setName("Python");
		e1.setSal(12.23);
		System.out.println(e1.getEmp_id());
		System.out.println(e1.getName());
		System.out.println(e1.getSal());
		
		Employee e2=new Employee(102,"PHP",20.36);
		System.out.println(e2.getEmp_id());
		System.out.println(e2.getName());
		System.out.println(e2.getSal());
		
		
	}

}
