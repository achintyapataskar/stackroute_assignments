import java.io.*;
import java.util.*;

public class Tom {
    public static String number_name(int input) {

        String status = "";
        if(input % 2 == 1 && input >= 20 && input <= 30) {
            status = "Tom";
            return status;
        }
        if(input % 2 == 0 && input >= 20 && input <= 30) {
            status = "Jerry";
            return status;
        }
        return status;
    }
    public static void main(String args[]) {
        int input;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        System.out.println(number_name(input));
    }
}