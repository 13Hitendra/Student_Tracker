package TEST3;

public class TechNumber{
	public static void main(String []args){
		System.out.println(" start ");

		for (int num=1000;num<=9999;num++)
		{
			int halfOne=num/100;
			int halfTwo=num%100;

			int addition=halfOne+halfTwo;
			int Square=addition*addition;

			if(num==Square)
			{
				System.out.println("   "+num);
			}
		}
	}
}
