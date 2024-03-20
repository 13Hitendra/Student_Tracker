package TEST3;

/*Special words are those words which starts and ends with the same letter.
 * Examples: EXISTENCE, COMIC, WINDOW.
 * Palindrome words are those words which read the same from left to right and vice-versa.
 *  Examples: MALAYALAM, MADAM, LEVEL, ROTATOR, CIVIC.
 *   All palindromes are special words, but all special words are not palindromes.
 *   Write a program to accept a word, check and print whether the word is a palindrome or only special.                                                                                        */

public class Test5Q10 {

	public static boolean palindrom(String str) {

		int start = 0;
		int last = str.length() - 1;

		while (start < last) {
			if (str.charAt(last) != str.charAt(start)) {
				return false;

			}
			start++;
			last--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String str = "LEVEL";
		String str= "SedtS";

		if (palindrom(str)) {
			System.out.println("String is palindrum and special");
		} else if (str.charAt(0) == str.charAt(str.length() - 1)) {
			System.out.println("word is special only");
		} else {
			System.out.println("neither palindrom nor special.");
		}

	}

}
