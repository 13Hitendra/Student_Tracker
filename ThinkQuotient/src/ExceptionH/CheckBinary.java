package ExceptionH;

public class CheckBinary extends CustomBinaryException {
	int number;
	
	public CheckBinary() {}
	
	public CheckBinary(int number)
	{
		this.number=number;
	}
	
	public void digitCheck(int number) throws CustomBinaryException	
	{
		
		while (number > 0) {
            int digit = number % 10;
            
            if(digit !=0 && digit != 1)
            {
            	throw new CustomBinaryException(number);
            }
               
            number /= 10;
        }
		System.out.println("number is binary");
	}
	
	public static void main(String[] args) {
		
		CheckBinary cb= new CheckBinary();
		try {
			cb.digitCheck(10610);
		} catch (CustomBinaryException e) {
			
			e.printStackTrace();
		}
		System.out.println("program ended");
	}

}
