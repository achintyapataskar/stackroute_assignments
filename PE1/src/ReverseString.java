import java.io.*;
import java.util.*;

public class ReverseString {
    public static String reverse(String input) {
        String reverse = "";
        for(int i = input.length() - 1; i >= 0; i--)
            reverse = reverse + input.charAt(i);
        return reverse;
    }
    public static void main(String args[]) {
        String input, reverse = "";
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        System.out.println(reverse(input));
    }
}