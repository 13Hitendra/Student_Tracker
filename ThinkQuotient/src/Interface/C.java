package Interface;

public class C {
	MyInterface obj;
	
	C(MyInterface obj)
	{
		this.obj=obj;
	}
	
	void employee()
	{
		int salary=1000;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		B obj1=new B();
		C obj2=new C(obj);
		
	}

}
