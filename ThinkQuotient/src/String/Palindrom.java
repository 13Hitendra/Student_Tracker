package String;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mamat";
		String str1="";
		
		char[]arr=str.toCharArray();
		
		int start=0;
		int end=str.length()-1;
		
		while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
		new String(arr);
		System.out.println(arr);
		
		if(arr.equals(str)) {
			System.out.println("palindrom");
		}
		else	{System.out.println("not palindrom");}
	}

}
