import java.io.*;
import java.util.*;

public class ReversePalindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int length_of_string = s.length();
        String rev = "";

        for(int i = length_of_string - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        System.out.printf("%s\n", rev);
        if(rev.equals(s)) {
            System.out.printf("Is a palindrome\n");
        } else {
            System.out.printf("Is not a palindrome\n");
        }
    }
}
