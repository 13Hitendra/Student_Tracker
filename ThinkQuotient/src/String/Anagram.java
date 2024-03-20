package String;
//check whether the String is anagram or not.
public class Anagram {
	
	public static void checkMethod(String str1,String str2) {
		
		char[]ch1=str1.toCharArray();
		char[]ch2=str2.toCharArray();
		
		if(str1.length() == str2.length())
	    {
	      for(int i=0; i<str1.length(); i++)
	      {
	        for(int j=i+1; j<str1.length(); j++)
	        {
	          if(ch1[i] > ch1[j])
	          {
	            char temp = ch1[i];
	            ch1[i] = ch1[j];
	            ch1[j] = temp;
	          }
	        }
	      }
		}
		
		if(str1.length() == str2.length())
	    {
	      for(int i=0; i<str2.length(); i++)
	      {
	        for(int j=i+1; j<str2.length(); j++)
	        {
	          if(ch2[i] > ch2[j])
	          {
	            char temp = ch1[i];
	            ch2[i] = ch2[j];
	            ch2[j] = temp;
	          }
	        }
	      }
		}
		String s1=new String(ch1);
		String s2=new String(ch2);
		System.out.println(s1.equals(s2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="late";
		String str2="tale";
		
		Anagram.checkMethod(str1, str2);
		//not complete
		
	}

}
