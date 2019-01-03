import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Power {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String number_as_a_string = in.nextLine();
        BigInteger number = new BigInteger(number_as_a_string);
        BigInteger power = new BigInteger("0");
        while(true) {
            BigInteger iterator = new BigInteger("1");
            BigInteger f = new BigInteger("1");
            while(iterator.compareTo(power) < 0) {
                f.multiply(number);
                iterator.add(BigInteger.ONE);
            }
        }
    }
}
