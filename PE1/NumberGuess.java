import java.io.*;
import java.util.*;

public class NumberGuess {
    public static void main(String args[]) {
        System.out.println("Range is 1 to 100");
        int number = 22;
        int guess;

        Scanner in = new Scanner(System.in);

        while(true) {
            guess = in.nextInt();
            if(guess == number) {
                System.out.println("Correct Guess");
                System.exit(0);
            } else if (guess > number) {
                System.out.println("Guess is greater than number");
            } else {
                System.out.println("Guess is lesser than number");
            }
        }
    }
}