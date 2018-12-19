import java.io.*;
import java.util.*;

public class CharacterType {
    public static String type(char input) {
        String lcc = "Lower Case Character";
        String ucc = "Upper Case Character";
        String digit = "Digit";
        String ss = "Special Symbol";
        if(input >= 'a' && input <= 'z') {
            return lcc;
        }
        if(input >= 'A' && input <= 'Z') {
            return ucc;
        }
        if(input >= '0' && input <= '9') {
            return digit;
        }
        return ss;
    }
    public static void main(String args[]) {
        char input;
        Scanner in = new Scanner(System.in);
        input = in.next().charAt(0);
        System.out.println(type(input));
    }
}