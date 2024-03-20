package LabOops;
 // if u write parameterized constr in program then default constr will not call automatically.
public class Check {
	Check()
	{
		System.out.println("default");
	}
	Check(int num)
	{
		System.out.println("num :"+num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c=new Check();
		Check c1=new Check(45);

	}

}
