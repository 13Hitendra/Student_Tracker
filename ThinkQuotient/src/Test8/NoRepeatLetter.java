package Test8;

public class NoRepeatLetter{

	public static char firstChar(String str1){
		
			String str=str1.toLowerCase();
		for(int i=0; i<str.length(); i++){
			char newchar=str.charAt(i);
			boolean repeat=false;
			for(int j=0; j < str.length(); j++)
			{
				if(i != j && str.charAt(j)==newchar){
					repeat=true;
					break;
				}
			}
			if(!repeat)
			{
				return newchar;
			}
		}
		return 0;
	}

	public static void main(String [] asdf)
	{
		String sentence= "My name is Yasmin";
		char letter=firstChar(sentence);
		
		System.out.println("First non repeating character is  "+letter);
	}
}

