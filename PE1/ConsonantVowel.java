import java.io.*;
import java.util.Scanner;
public class ConsonantVowel {
    public static void main(String args[]) {
        String input;
        Scanner in = new Scanner(System.in);
        input = in.nextLine();

        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
                    System.out.println(input.charAt(i) + "vowel");
                else
                    System.out.println(input.charAt(i) + "consonant");
            } else {
                System.out.println("Error. Not a letter.");
            }
        }
    }
}