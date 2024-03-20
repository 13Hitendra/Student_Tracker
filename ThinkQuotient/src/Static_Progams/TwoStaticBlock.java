package Static_Progams;

public class TwoStaticBlock {
	 String name;
	
	static {
		System.out.println("first block");
	}	
	//instance init block
	{
		name="someone";
		System.out.println("Instance init block");
	}
	//second init block
	{
		name="Anybody";
		System.out.println("second init block");
	}
	static {
		System.out.println("second block");
	}
	
	TwoStaticBlock(String name)
	{
		this.name=name;
	}
	TwoStaticBlock(){} //default const.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is main method");
		
		TwoStaticBlock tb= new TwoStaticBlock();
		System.out.println(tb.name);
		
		TwoStaticBlock tb1= new TwoStaticBlock();
		System.out.println(tb1.name);
		
		TwoStaticBlock tb2= new TwoStaticBlock("Anonymous");
		System.out.println(tb2.name);
		
	}
	
}
