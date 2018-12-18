import java.io.*;
import java.util.*;

public class Tom {
    public static void main(String args[]) {
        int input;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();

        if(input % 2 == 1 && input >= 20 && input <= 30)
            System.out.println("Tom");
        if(input % 2 == 0 && input >= 20 && input <= 30)
            System.out.println("Jerry");
    }
}