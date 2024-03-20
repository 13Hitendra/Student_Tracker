package ExceptionH;

public class Propagation {
//By default Unchecked Exceptions are forwarded in calling chain (propagated).
	void m(){  
			    int data=50/0;  
		  }  
			  void n(){  
			    m();  
			  }  
			  void p(){  
	   try{  
			    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
			  }  
			  public static void main(String args[]){  
			   Propagation obj=new Propagation();  
			   obj.p();  
			   System.out.println("normal flow...");  
			  }  

}
