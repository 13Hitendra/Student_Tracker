package ExceptionH;

import java.io.IOException;

public class Throws {
    public static void main(String[] args) throws IOException {
        
        readFile("example.txt");
    }

   
    public static void readFile(String fileName) throws IOException {
        
        throw new IOException("Unable to read file: " + fileName);
    }
}
