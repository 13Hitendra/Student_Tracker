package Inheritance;

public class TestTwo extends TestOne {
	int a;
	int j;
	TestTwo(){
		a=9;
	}
	TestTwo(int a, int b)
	{
		super(a);
		this.a=b;
	}
	
	/*public void calsal()		//comp error remove final of superclass
	{
		
	}*/
	public static void main(String[] args) {
	
		final TestTwo tt=new TestTwo();
		tt.j=23;
		tt.j=12;
		System.out.println(tt.j);
		//tk=new TestTwo();		//not allowed. means if we make object final , more object cant be produce
		
		TestOne te=new TestTwo();
		System.out.println(te.a);
		
		te.calsal();
		
		
	}

}
