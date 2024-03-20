package ExceptionH;

import java.io.IOException;

//By default, Checked Exceptions are not forwarded in calling chain (propagated).
class Propagation2 {
	void m() {
//	    throw new java.io.IOException("device error");//checked exception  . uncomment this
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handeled");
		}
	}

	public static void main(String args[]) {
		Propagation2 obj = new Propagation2();
		obj.p();
		System.out.println("normal flow");
	}
}
