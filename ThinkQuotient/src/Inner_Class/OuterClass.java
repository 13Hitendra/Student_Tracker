package Inner_Class;

// methodlocalinner class

public class OuterClass {

	int outer_a;
	OuterClass()
	{
		outer_a=90;
	}
	
	public void show()
	{
		class Inner					//class inside method
		{
			int inner_a;
			Inner()
			{
				inner_a=45;
			}
			public void show()
			{
				System.out.println("inner a "+inner_a);
				System.out.println("outer a "+outer_a);
			}
		}
		Inner i=new Inner();
		i.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass o=new OuterClass();
		o.show();
	}

}
