import java.io.*;
import java.util.*;

public class CharacterType {
    public static void main(String args[]) {
        char c;
        Scanner in = new Scanner(System.in);
        c = in.next().charAt(0);
        if(c >= 'a' && c <= 'z') {
            System.out.println("Lower Case Character");
            System.exit(0);
        }
        if(c >= 'A' && c <= 'Z') {
            System.out.println("Upper Case Character");
            System.exit(0);
        }
        if(c >= '0' && c <= '9') {
            System.out.println("Digit");
            System.exit(0);
        }
        System.out.println("Special Symbol");
    }
}