package LabOops;
/*Write a Java program to create Employee class with following details 
data members  : id,ename,basicsal ,pf,hra,da  ,netsal ,deptno
default and parametric constructors
methods : displayEmp().calculateSal() 
Note : pf is 10% basicsal,hra is 15% of basicsal ,da is 20% of basicsal 
netsal=basicsal-pf+da+hra

Write a test program in which create 2 employee object and call methods*/

public class Employe {
	private double id,basicSal,deptNo;
	private String eName;
	double pf,hra,da,netSal;
	
	
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}

	public double getBasicSal() {
		return basicSal;
	}
	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(double deptNo) {
		this.deptNo = deptNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}

	Employe()
	{
		
	}
	
	Employe(double id,String eName,double basicSal,double deptNo)
	{
		this.id=id;
		this.eName=eName;
		this.basicSal=basicSal;
		this.deptNo=deptNo;
	}
	
	public void calculateSal()
	{
		pf=0.1*basicSal;
		da=0.2*basicSal;
		hra=0.15*basicSal;
		netSal=basicSal-(pf+da+hra);
		
	}
	public void displayEmp()
	{
		System.out.println("Id="+id+"    Employee name= "+eName);
		System.out.println("Basic salary = "+basicSal);
		System.out.println("Net salary = "+netSal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e1=new Employe();
		
		e1.setBasicSal(12000);                //set values by setter 
		e1.setDeptNo(202);
		e1.seteName("Anonymous");
		e1.setId(99);
		e1.calculateSal();
		e1.displayEmp();
		
		Employe e2=new Employe(562,"somebody",4562,100); //parameterized
		e2.calculateSal();
		e2.displayEmp();
		
		Employe e=new Employe();			//default constrctr
		e.calculateSal();
		e.displayEmp();
		
	}

}
