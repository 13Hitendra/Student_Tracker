package CJ;

public class ternary2 {

	public void EvenOdd() {
		String str=" ";
		int n1=4;
		
		str=(n1%2==0)?n1+" is even":n1+" is odd";
		System.out.println(str);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ternary2 t2=new ternary2();
		t2.EvenOdd();
		
	}

}
