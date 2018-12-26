import java.util.Scanner;

public class ChessBoard {
    int rows, cols;
    public String board(int rows, int cols) {
        String answer = "";
        String[][] elements = new String[rows][cols];
        int k = -1;
        for(int i = 0; i < rows; i++) {
            k++;
            for(int j = 0; j < cols; j++) {
                if(k++ % 2 == 0)
                    elements[i][j] = "WW|";
                else
//                    answer += "BB|";
                    elements[i][j] = "BB|";
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                answer += elements[i][j];
            }
            answer += "\n";
        }
        return answer;
    }
    public boolean check_rows_and_cols(int rows, int cols) {
        if(rows == cols)
            return true;
        else
            return false;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ChessBoard cb = new ChessBoard();
        System.out.println("Enter dimension: ");
        cb.rows = cb.cols = in.nextInt();
        if(cb.check_rows_and_cols(cb.rows, cb.cols) == false)
            System.exit(0);
        System.out.println(cb.board(cb.rows, cb.cols));
    }
}
