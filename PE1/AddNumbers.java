import java.io.*;
import java.util.*;
public class AddNumbers {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
/*        int new_number = 0, sum = 0;
        String input;
        input = in.nextLine();
        int length_of_input = input.length();

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
        System.out.println(sum);*/
        int sum = 0;
        while(in.hasNext()) {
            String input = in.nextLine();
            int flag = 0;
            for(int i = 0; i < input.length(); i++)
                if(input.charAt(i) != ' ' && input.charAt(i) > '9' || input.charAt(i) < '0') {
                    flag = 1;
                    break;
                }
            if(flag == 1) {
                flag = 0;
                System.out.println("Not a number");
                continue;
            }
            sum += Integer.parseInt(input);
            System.out.print(sum);
        }
    }
}