package Inheritance;

public class A {
	
	int i;
	
	A(){
		System.out.println("A default");
		i=10;
	}
	
	A(int i)
	{
		this.i=i;
	}
	
	void show()
	{
		System.out.println(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
