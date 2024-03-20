package Mid_Test;

 class One
{
	public void example(String str)
	{
		System.out.println("in example method os One Class "+str);
	}
}

public class OverRiding extends One{
	public void example(String str)
	{
		System.out.println("In example method of OverRiding Class "+str);
	}
	public void method2()

	{
		
	}public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverRiding or=new OverRiding();
		or.example("hi");
		
	
	}

}
