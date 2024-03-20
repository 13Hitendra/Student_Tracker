package Inheritance;

public class Manager extends Employee {
	
	int nofemp;
	double bonus;
	
	Manager()
	{
		super();
		nofemp=0;
		bonus=0;
	}
	Manager(int eid,String name,double salary,int n,double b)
	{
		super(eid,name,salary);
		nofemp=n;
		bonus=b;
	}
	public void calculateSal()
	{
		super.calcSal();
		super.netSal=netSal+bonus;
	}
	public String toString()
	{
		return super.toString()+"\n    no.of.Emp= "+nofemp+"    Bonus= "+bonus;
	}
	
	/*private static void AccesSpec() 					//cant reduce acces in subclass
	{
		System.out.println("method acces specifier in override");
	} */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.calcSal();
		System.out.println(m);
		
		Manager m1=new Manager(145,"thatsMe",45000,14,26000);
		m1.calcSal();
		System.out.println(m1);
	}

}
