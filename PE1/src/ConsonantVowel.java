import java.io.*;
import java.util.Scanner;
public class ConsonantVowel {
    public static String character(char character_to_test) {
        String status;
        if(character_to_test >= 'a' && character_to_test <= 'z') {
            if(character_to_test == 'a' || character_to_test == 'e' || character_to_test == 'i' || character_to_test == 'o' || character_to_test == 'u')
                status = character_to_test + " vowel";
            else
                status = character_to_test + " consonant";
        } else {
            status = "Error. Not a letter.";
        }
        return status;
    }
    public static void print_char_type(String input) {
        for(int i = 0; i < input.length(); i++) {
            System.out.println(character(input.charAt(i)));
        }
    }
    public static void main(String args[]) {
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        print_char_type(input);
    }
}