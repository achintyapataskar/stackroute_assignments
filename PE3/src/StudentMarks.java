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
