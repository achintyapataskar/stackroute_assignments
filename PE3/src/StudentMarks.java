//Create a class called StudentMarks, which prompts user for the number of students, reads it from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the grades of each of the students and saves them in an int array called stuGrades. Your program shall check that the grade is between 0 and 100 else has to trow an error message.00
import java.util.Scanner;

public class StudentMarks {
    int[] stuGrades;
    int numOfStudents;
    public boolean initStuGrades(int number_of_students) {
        if(number_of_students <= 0)
            return false;
        stuGrades = new int[number_of_students];
        numOfStudents = number_of_students;
        return true;
    }

    public boolean check_marks(int marks) {
        if(marks < 0 || marks > 100)
            return false;
        return true;
    }
    void inputMarks() {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < numOfStudents; i++) {
            stuGrades[i] = in.nextInt();
        }
    }
    String printMarks() {
        String marks= "";
        for(int i = 0; i < numOfStudents; i++)
            marks += stuGrades[i] + " ";
        return  marks;
    }
    public static void main(String args[]) {
        StudentMarks sm = new StudentMarks();
        int number_of_students = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of students");
        number_of_students = in.nextInt();
        sm.initStuGrades(number_of_students);
        System.out.println("Enter marks of each student");
        sm.inputMarks();
        System.out.println(sm.printMarks());
    }


}
