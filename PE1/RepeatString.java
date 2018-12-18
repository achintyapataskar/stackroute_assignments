import java.io.*;
import java.util.*;

public class RepeatString {
    public static void main(String args[]) {
        int n;
        String input, postfix = "";
        Scanner in = new Scanner(System.in);

        input = in.nextLine();
        n = in.nextInt();

        for(int i = input.length() - n; i < input.length(); i++)
            postfix = postfix + input.charAt(i);

        System.out.print(input);
        for(int i = 0; i < n; i++)
            System.out.print(postfix);
    }

}