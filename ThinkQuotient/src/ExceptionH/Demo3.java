package ExceptionH;

public class Demo3 {

	static int sum;
	
	    public static void main(String[] args) {
	        try {
	            sum=45+78;
	            int result = 10 / 0; 
	        } 
	  //      catch(Exception e) {}				// if u dont write catch then it will terminate ur program
	        finally {
	            
	            System.out.println("Finally block executed.");
	           System.out.println(sum);		// but we dont return value from finally . cause if no exception occure still finally will work.
	        }
	        double d=56+7;
	     	   System.out.println(d); 
	}

}
