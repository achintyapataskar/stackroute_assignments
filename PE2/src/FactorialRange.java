import java.io.*;
import java.util.*;
public class FactorialRange {
    public static void main(String args[]) {
        System.out.printf("Int Factorials:\n");
        int f = 1, n = 1, old_f = 1;
        while(true) {
            f = f * n;
            if(f < old_f) {
                System.out.printf("Factorial of %2d is out of range", n);
                break;
            }
            System.out.printf("Factorial of %2d is %-10d\n", n, f);
            old_f = f;
            n++;
        }
    }
}
