import java.io.*;
import java.util.*;

public class CharacterType {
    public static void type(char input) {
        if(input >= 'a' && input <= 'z') {
            System.out.println("Lower Case Character");
            System.exit(0);
        }
        if(input >= 'A' && input <= 'Z') {
            System.out.println("Upper Case Character");
            System.exit(0);
        }
        if(input >= '0' && input <= '9') {
            System.out.println("Digit");
            System.exit(0);
        }
        System.out.println("Special Symbol");
    }
    public static void main(String args[]) {
        char input;
        Scanner in = new Scanner(System.in);
        input = in.next().charAt(0);
        type(input);
    }
}