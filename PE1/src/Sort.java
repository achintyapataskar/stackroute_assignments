import java.io.*;
import java.util.*;

public class Sort {
    public static int[] digits_of_number(int input) {
        int[] arr = new int[256];
        int arr_index = 0, arr_length = 0, sum = 0;
        while(input != 0) {
            int r = input % 10;
            arr[arr_index++] = r;
            arr_length++;
            input /= 10;
        }
        return arr;
    }
    public static int sum_of_even_digits(int input) {
        int sum = 0;
        while(input != 0) {
            int digit = input % 10;
            if(digit % 2 == 0)
                sum += digit;
            input /= 10;
        }
        return sum;
    }
    public static String sum_status(int input) {
        String status = "";
        int sum_even_digits = sum_of_even_digits(input);
        if(sum_even_digits > 15) {
            status = "True";
        } else {
            status = "False";
        }
        return status;
    }
    public static void print_sorted_digits(int arr[]) {
        int length_of_array = arr.length;
        for(int i = length_of_array - 1; i >= 0; i--)
            System.out.println(arr[i]);
    }
    public static void main(String args[]) {
        int input;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        int[] arr = new int[256];

        arr = digits_of_number(input);
        Arrays.sort(arr, 0, arr.length);
        print_sorted_digits(arr);
        System.out.println("Sum of even numbers is: " + sum_of_even_digits(input));
        System.out.println(sum_status(input));
    }
}