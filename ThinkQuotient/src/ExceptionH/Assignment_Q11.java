package ExceptionH;
/*WAP to return int value in try block and return int value in
 *  finally block and observe which return takes precedence*/

public class Assignment_Q11 {

	@SuppressWarnings("finally")
	public static int getResult() {
        try {
            return 12;
        } 
        finally 
        { return 23;}
    }
	public static void main(String[] args) {
        System.out.println("Value from getResult(): " + getResult());
    }

}
