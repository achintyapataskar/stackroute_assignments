import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void sizeZeroBoard() {
        ChessBoard cb = new ChessBoard();
        cb.rows = cb.cols = 0;
        String empty = "";
        assertEquals(empty, cb.board(0, 0));
    }
    @Test
    public void sizeOneBoard() {
        ChessBoard cb = new ChessBoard();
        cb.rows = cb.cols = 1;
        String empty = "WW|\n";
        assertEquals(empty, cb.board(1, 1));
    }

    @Test
    public void sizeTwoBoard() {
        ChessBoard cb = new ChessBoard();
        cb.rows = cb.cols = 2;
        String empty = "WW|BB|\nBB|WW|\n";
        assertEquals(empty, cb.board(2, 2));
    }

    @Test
    public void rowsAndColsFail() {
        ChessBoard cb = new ChessBoard();
        cb.rows = 1;
        cb.cols = 2;
        assertEquals(false, cb.check_rows_and_cols(cb.rows, cb.cols));
    }
    @Test
    public void rowsAndColsSucess() {
        ChessBoard cb = new ChessBoard();
        cb.rows = 2;
        cb.cols = 2;
        assertEquals(true, cb.check_rows_and_cols(cb.rows, cb.cols));
    }
}