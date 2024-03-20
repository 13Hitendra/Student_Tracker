package CJ;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TernaryOp tp=new TernaryOp();
		tp.CheckTernary();
	}

	public void CheckTernary() {
		String ch=" ";
		int n1=23, n2=32;
		
		ch=(n1<n2)?n2+" is greater": n1+" is greater";
		System.out.println(ch);
		
	}
}
