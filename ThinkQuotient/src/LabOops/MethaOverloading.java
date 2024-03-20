package LabOops;

public class MethaOverloading {
	
	public int add(int num1,int num2)
	{
		System.out.println(" add(int num1,num2)");
		return num1+num2;
	}
	
	public float add(float num1,int num2)
	{
		System.out.println(" add(float num1,num2)");
		return num1+num2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethaOverloading m=new MethaOverloading();
		
		int a=m.add(45, 70);
		System.out.println(a);
		
		float b=m.add(12.4f, 78);
		System.out.println(b);
//		m.add(1.2, 25,2);                                                           //if args dont match with method it gives error.
		
	}

}
