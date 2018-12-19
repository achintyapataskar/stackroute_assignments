import java.io.*;
import java.util.*;

public class Pattern {
    public static String ans(int input) {
        String answer = "";
        if(input == 0)
            return answer;
        for(int i = 1; i <= input; i++) {
            for(int j = 1; j <= i; j++) {
                answer = answer + i;
                answer = answer + " ";
            }
        }
        return answer.substring(0, answer.length() - 1);
    }
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(ans(n));
    }
}