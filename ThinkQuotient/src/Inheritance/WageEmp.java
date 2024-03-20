package Inheritance;

public class WageEmp extends Manager {
	double hrs,rate;
	
	WageEmp()
	{
		hrs=0;
		rate=0;
	}
	WageEmp(int eid,String name,double salary,int n,double b,double hrs,double rate)
	{
		super(eid,name,salary,n,b);
		this.hrs=hrs;
		this.rate=rate;
	}
	
	public void calculateSal()
	{
		super.calculateSal();
		super.netSal=netSal+hrs*rate;
	}
	public String toString()
	{
		return super.toString()+"\n    hrs= "+hrs+"    rate= "+rate;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WageEmp we1=new WageEmp(456,"Jay",10000,10,20000,8,300);
		we1.calculateSal();
		System.out.println(we1);
	}

}
