package Inheritance;

class A1
{
	int a;
	A1(int a)
	{
		System.out.println("1");
	}
}
class B1 extends A1
{
	int b;
	B1(int a,int b) {
		super(b);
		System.out.println("2");
	}
	
}
class C1 extends B1
{
	int c;
	C1(int a, int b,int c) {
		super(a, b);
		System.out.println("3");
	}
	
}
public class D1 extends C1 {
	int d;
	D1(int a, int b, int c,int d) {
		super(a, b, c);
		System.out.println("4");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1 d=new D1(9, 12, 45, 12);
	}

}
