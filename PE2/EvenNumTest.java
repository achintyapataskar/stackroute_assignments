import java.io.*;
import java.util.*;

public class EvenNumTest {
    public static boolean isEven(int number) {
        if(number % 2 == 0)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(isEven(n));
    }
}
