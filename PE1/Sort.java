import java.io.*;
import java.util.*;

public class Sort {
    public static void main(String args[]) {
        int input;
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        int[] arr = new int[256];
        int arr_index = 0, arr_length = 0, sum = 0;
        while(input != 0) {
            int r = input % 10;
            arr[arr_index++] = r;
            arr_length++;
            input /= 10;
        }
        Arrays.sort(arr, 0, arr_length);
        for(int i = arr_length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            if (arr[i] % 2 == 0)
                sum += arr[i];
        }
        System.out.println("Sum of even numbers is: " + sum);
        if(sum > 15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}