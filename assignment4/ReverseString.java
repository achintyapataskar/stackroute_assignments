import java.io.*;
import java.util.*;

public class ReverseString {
    public static void main(String args[]) {
        String input, reverse = "";
        Scanner in = new Scanner(System.in);
        input = in.nextLine();
        for(int i = input.length() - 1; i >= 0; i--)
            reverse = reverse + input.charAt(i);
        System.out.println(reverse);
    }
}