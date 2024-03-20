package Inheritance;

public class SalesPerson extends WageEmp {
	double sales,commision;
	
		SalesPerson(){
			sales=0;
			commision=0;
		}
	
		SalesPerson(int eid,String name,double salary,int n,double b,double hrs,double rate,double sales, double commision) {
		super(eid,name,salary,n,b,hrs,rate);
		this.sales = sales;
		this.commision = commision;
	}
		public void calculateSal()
		{
			super.calculateSal();
			super.netSal=netSal+sales*commision;
		}
		public String toString()
		{
			return super.toString()+"\n   sales="+sales+"    Commision="+commision;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson sp1=new SalesPerson(777,"Sagar",45000,4,20000,6,500,28,0.2);
		sp1.calculateSal();
		System.out.println(sp1);
	}

}
