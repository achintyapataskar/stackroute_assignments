//Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier, assume the digits are a string and use split()
//        Input: 98,96,95,94,93
//        Output: 98,96,95,94,93 non consecutive numbers
//
//        Input: 54,53,52,51,50,49,48
//        Output : 54,53,52,51,50,49,48 are consecutive numbers
//
//        Input: 1,2,3,4,5,6,6
//        Output: 1,2,3,4,5,6,6 non consecutive numbers

import java.util.Scanner;
import java.lang.*;

public class Consecutive {
    public String input;

    public boolean test_input() {
        String[] tokens = input.split(",");
        if(tokens.length != 7)
            return false;
        return true;
    }
    public boolean test_consecutive() {
        int index = 0;
        int[] numbers= new int[7];
        String[] tokens = input.split(",");
        for(String str : tokens) {
            numbers[index++] = Integer.parseInt(str);
        }
        int direction = 0;
        //0 increment
        //1 decrement
        if(numbers[0] < numbers[1])
            direction = 0;
        else
            direction = 1;
        if(direction == 0) {
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] + 1 != numbers[i + 1])
                    return false;
            }
            return true;
        } else {
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] != numbers[i + 1] + 1)
                    return false;
            }
            return true;
        }
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Consecutive c = new Consecutive();
        c.input = in.nextLine();
        if(c.test_input() == false)
            System.exit(0);
        if(c.test_consecutive() == true)
            System.out.println(c.input + " are consecutive.");
        else
            System.out.println(c.input + " are not consecutive.");

    }
}
