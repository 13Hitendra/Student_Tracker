package CJ;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f_no=0,s_no=1, t_no, count=5;
		System.out.println(f_no+"  "+s_no);
		 
		for(int i=2;i<count;i++)
		{
			t_no=f_no+s_no;
			System.out.print(" "+t_no);
			f_no=s_no;
			s_no=t_no;
		}		
	}

   
}
