import java.io.*;
import java.util.*;
public class AddNumbers {
    public static int sum(String input) {
        int length_of_input = input.length(), sum = 0, new_number = 0;
        for(int i = 0; i <= length_of_input; i++) {
            if(i == length_of_input) {
                sum += new_number;
                break;
            }
            if(input.charAt(i) == ' ') {
                sum += new_number;
                new_number = 0;
                continue;
            }
            if(input.charAt(i) > '9' || input.charAt(i) < '0') {
                System.out.println("Not a number");
                new_number = 0;
                while(i < length_of_input && input.charAt(i) != ' ')
                    i++;
                continue;
            }
            new_number = new_number * 10 + Character.getNumericValue(input.charAt(i));
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input;
        input = in.nextLine();

        System.out.println(sum(input));
    }
}