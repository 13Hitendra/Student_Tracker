package String;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		String str="i am from india";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
		}System.out.println(count);
		
		String s1="mmk";
		String s2="cfj";
		String s3=s1.concat(s2);
		System.out.println(s3);
	}

}
