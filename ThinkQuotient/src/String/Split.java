package String;
//WAP to split String into 2 tokens where string is "HELLO$WORLD"
public class Split {
    public static void main(String[] args) {
        String str = "HELLO$WORLD";
        String remov = "$";

        String[] half = new String[2];
        
        int first = 0;
        int startInd = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == remov.charAt(0)) {
               
                half[first++] = str.substring(startInd, i);
               
                startInd = i + 1;
            }
        }
     
        half[first] = str.substring(startInd);

        for (String substring : half) {
            System.out.println(substring);
        }
    }
}
