import java.io.*;
import java.util.*;

public class NumberGuess {
    public static String nature_of_the_number(int guess, int number) {
        String status;
        if(guess == number) {
            status = "Correct Guess";
            return status;
        } else if (guess > number) {
            status = "Guess is greater than number";
            return status;
        } else {
            status = "Guess is lesser than number";
            return status;
        }
    }
    public static void guess_match(int number) {
        Scanner in = new Scanner(System.in);
        int guess;
        while(true) {
            guess = in.nextInt();
            System.out.println(nature_of_the_number(guess, number));
        }
    }
    public static void main(String args[]) {
        System.out.println("Range is 1 to 100");
        int number = 22;
        guess_match(number);
    }
}