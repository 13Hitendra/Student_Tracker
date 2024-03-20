package Wrapper_Class;

public class Widening {

	public static void myMethod(Integer i)		// if there is no same/bigger primitive data type , it will search for similar Wrapper.
	{
		System.out.println("Integer = "+i);
	}
	public static void myMethod(long i)			// first it will check for similar/bigger primitive data type only
	{
		System.out.println("Long =" +i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=78;
		myMethod(i);		// it can't converted into bigger Wrapper class.
	}

}
