import java.io.*;
import java.util.*;

public class FileCapitalise {
    public static void main(String args[]) throws IOException {
        FileInputStream  in = null;

        try {
            in = new FileInputStream("input.txt");
        } catch(IOException ex) {
            System.out.printf("File not found");
        }
        int c;
        while((c = in.read()) != -1) {
            if(c >= 'a' && c <= 'z') {
                System.out.printf("%c", c - ('a' - 'A'));
            } else {
                System.out.printf("%c", c);
            }
        }
    }
}
