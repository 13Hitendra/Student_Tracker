package Inheritance;

public class B extends A {
	int j;
	B(){
		super(56);
		//this(56);
		System.out.println("B default");
		j=20;
	}
	
	B(int j)
	{
		this.j=j;
	}
	
	void show()
	{
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.show();
	}

}
