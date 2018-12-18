import java.io.*;
import java.util.*;

public class Grades {
    public static int max(int grades[]) {
        int max = -1;
        for(int i = 0; grades[i] != -1; i++) {
            if(max < grades[i])
                max = grades[i];
        }
        return max;
    }
    public static int min(int grades[]) {
        int min = 1000;
        for(int i = 0; grades[i] != -1; i++) {
            if(min > grades[i])
                min = grades[i];
        }
        return min;

    }
    public static float average(int grades[]) {
        float avg, sum = 0;
        int n = 0;
        for(int i = 0; grades[i] != -1; i++) {
            sum += grades[i];
            n++;
        }
        avg = sum / n;
        return avg;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] grades = new int[100];
        for(int i = 0; i < 100; i++)
            grades[i] = -1;
        int n;
        System.out.print("Enter the number of students: ");
        n = in.nextInt();
        for(int i = 0; i < n; i++) {
            int marks;
            System.out.printf("Enter marks for student %d ", i + 1);
            try {
                marks = in.nextInt();
                grades[i] = marks;
            } catch(InputMismatchException im) {
                System.out.println("INVALID INPUT. TRY AGAIN.");
            }
        }
        System.out.printf("Average is %3.2f\n", average(grades));
        System.out.printf("Minimum is %2d\n", min(grades));
        System.out.printf("Maximum is %2d\n", max(grades));

    }
}
