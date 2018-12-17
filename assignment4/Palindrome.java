import java.io.*;
import java.util.*;

public class Palindrome {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int input, reverse = 0, sum = 0;
        input = in.nextInt();

        int copy = input;
        while(copy != 0) {
            int r = copy % 10;
            if(r % 2 == 0)
                sum += r;
            reverse = reverse * 10 + r;
            copy /= 10;
        }
        if(input == reverse) {
            System.out.print(input + " is a palindrome");
        } else {
            System.out.print(input + "is not a palindrome");
            System.exit(0);
        }
        if(sum > 25)
            System.out.println(" and sum of even numbers is greater than" + 25);
        else
            System.out.println(" and sum of numbers is less than 25");
    }
}