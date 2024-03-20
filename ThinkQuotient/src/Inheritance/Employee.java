package Inheritance;

public class Employee {
	int eid;
	String name;
	double basicSal,netSal;
	//hra=0.2,da=0.1 , pf=0.15
	public Employee() {}
	
	public Employee(int eid,String name,double basicSal)
	{
		this.basicSal=basicSal;
		this.eid=eid;
		this.name=name;
	}
	
	public void calcSal()
	{
		netSal=basicSal+(basicSal*0.2)+(basicSal*0.15)-(basicSal*0.1);
	}
	public String toString()
	{
		return "ID = "+eid+"   Name=  "+name+"    BasicSal=  "+basicSal+"    netSalary=  "+netSal;
	}
	
	static void AccesSpec()
	{
		System.out.println("method acces specifier in override");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		System.out.println(obj);
		
		Employee obj1=new Employee(123,"Rohit",50000);
		obj1.calcSal();
		System.out.println(obj1);
	}

}
