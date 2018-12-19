import java.io.*;
import java.util.*;

public class Palindrome {
    public static int reverse(int input) {
        int copy = input, reverse = 0;
        while(copy != 0) {
            int r = copy % 10;
//            if(r % 2 == 0)
//                sum += r;
            reverse = reverse * 10 + r;
            copy /= 10;
        }
        return reverse;
    }
    public static String palindrome(int input, int reverse) {
        String status;
        if(input == reverse) {
            status = input + " is a palindrome";
            return status;
        } else {
            status = input + " is not a palindrome";
            return status;
        }
    }
    public static String sum(int input) {
        String status = "";
        if(input == reverse(input)) {
            int sum = 0;
            while(input != 0) {
                int digit = input % 10;
                if(digit % 2 == 0)
                    sum += digit;
                input /= 10;
            }
            if(sum > 25) {
                status = " and sum of even numbers is greater than 25";
            } else {
                status = " and sum of even numbers is lesser than 25";
            }
        }
        return status;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int input, sum;
        input = in.nextInt();
        System.out.println(palindrome(input, reverse(input)));
    }
}