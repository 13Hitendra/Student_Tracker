package Inheritance;

public class TestOne {     		//if i write final instead public then this class can't inherit in TestTwo
	int a=10;
	
	TestOne(){}
	TestOne(int a){}
	
	final void calsal()
	{
		a=a+10;
		methOne();
	}
	
	public void methOne()
	{
		System.out.println("a ="+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOne to =new TestOne();
		to.calsal();
	}

}
