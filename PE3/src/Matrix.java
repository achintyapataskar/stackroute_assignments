//Write a program to compute the addition of two matrix, Read the number of rows and columns as input, also the values of each matrix
//        Output:
//        Input number of rows of matrix: 3
//        Input number of columns of matrix: 2
//        Input elements of first matrix: 1 2 3 4 5 6
//        Input the elements of second matrix: 9 8 7 6 5 4
//        Sum of the matrices:-
//        10        10
//        10        10
//        10        10

import java.util.Scanner;

public class Matrix {
    int row, col;
    int[][] matrix_elements;
    public boolean check_value(int val) {
        //checks values for rows and columns
        if(val < 0)
            return false;
        return true;
    }
    public boolean checkDimensions() {
//        Scanner in = new Scanner(System.in);
//        row = in.nextInt();
//        col = in.nextInt();
        if(check_value(row) == false || check_value(col) == false)
            return false;
        return true;//return true only if rows and columns are checked
    }
    public void initMatirx() {
        matrix_elements = new int[row][col];
    }
    public void input_matrix_elements() {
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                matrix_elements[i][j] = in.nextInt();
            }
        }
    }
    public String PrintMatrix() {
        String answer = "";
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                answer += matrix_elements[i][j] + " ";
            }
            answer += "\n";
        }
        return answer;
    }
    public boolean addable(Matrix a, Matrix b) {
        if(a.row == b.row && a.col == b.col)
            return true;
        return false;
    }
    public boolean addMatrices(Matrix a, Matrix b) {
        if(!addable(a, b)) {
            return false;
        }
        for(int i = 0; i < a.row; i++)
            for(int j = 0; j < a.col; j++)
                matrix_elements[i][j] = a.matrix_elements[i][j] + b.matrix_elements[i][j];
        return true;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Matrix a = new Matrix(), b = new Matrix(), c = new Matrix();
        System.out.println("Enter number of rows and columns for matrix a: ");
        a.row = in.nextInt();
        a.col = in.nextInt();
        System.out.println("Enter number of rows and columns for matrix b: ");
        b.row = in.nextInt();
        b.col = in.nextInt();
        System.out.println("Enter number of rows and columns for matrix c: ");
        c.row = in.nextInt();
        c.col = in.nextInt();

        a.initMatirx();
        b.initMatirx();
        c.initMatirx();

        a.input_matrix_elements();
        b.input_matrix_elements();

        c.addMatrices(a, b);
        System.out.println(c.PrintMatrix());
    }
}
