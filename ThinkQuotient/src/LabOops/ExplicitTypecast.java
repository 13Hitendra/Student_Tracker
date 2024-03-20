package LabOops;

public class ExplicitTypecast {
	
	
	public int add(int num1)
	{
		System.out.println(num1);
		return num1;
	}
	
	public int add(int ... n)     //used to take multiple arguments
	{
		System.out.println("Array with var-args :");
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		return sum;
	}
	
	public double add(double num1)
	{
		System.out.println(num1);
		return num1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExplicitTypecast et=new ExplicitTypecast();
		float value=15.6f;
		et.add(value);
		et.add((int)value);     //explicitely typecasted value to int.
		et.add(12,56,45,78);
	}

}
