package Inner_Class;

public class Outer {
	
	int outer_a;
	Outer()
	{
		outer_a=10;
	}
	
	public void show()
	{
		System.out.println("outer member= "+outer_a);
		Inner in=new Inner();				//created object of inner class
		in.show();
	}
	
	class Inner
	{
		int inner_a;
		Inner()
		{
			 inner_a=50;
		}
		
		public void show()
		{
			System.out.println("In inner show ");
			System.out.println("inner a ="+inner_a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.show();
		
		Inner io=o.new Inner();			// syntax of making object of inner class
		io.show();
	}

}
