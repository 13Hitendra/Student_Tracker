package String;

import java.util.Scanner;

public class FirstOcc {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.print("Enter the character to find: ");
        char find = sc.next().charAt(0);

        int index = FirstOccurrence(str, find);

        if (index != 2) {
            System.out.println("The first occurrence of '" + find + "' is at index: " + index);
        } else {
            System.out.println(find+" is not found in the string.");
        }
    }

    public static int FirstOccurrence(String str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }
        return 2; 
       
    }
}
