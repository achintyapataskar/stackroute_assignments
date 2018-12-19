import java.io.*;
import java.util.*;

public class RepeatString {
    public static String postfix_operation(String input, int n) {
        String postfix = "";
        if(n < 0)
            return postfix;
        if(input.equals(""))
            return postfix;
        if(input.length() < n)
            return postfix;
        String answer = input;
        for(int i = input.length() - n; i < input.length(); i++)
            postfix = postfix + input.charAt(i);

        for(int i = 0; i < n; i++)
            answer = answer + postfix;
        return answer;
    }
    public static void main(String args[]) {
        int n;
        String input;
        Scanner in = new Scanner(System.in);

        input = in.nextLine();
        n = in.nextInt();

        System.out.println(postfix_operation(input, n));
    }

}