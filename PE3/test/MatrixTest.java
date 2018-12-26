// Love of my life, don't leave me
//You've stolen my heart, you now deserve me
//Freddie Mercury is the best...

import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
//    @Test
//    public void getRowNegative() {
//        Matrix m = new Matrix();
//        assertNotEquals(-1, m.getRow());
//    }
//
////    @Test
////    public void getRowZero() {
////        Matrix m = new Matrix();
////        assertNotEquals(0, m.getRow());
////    }
//
////    @Test
////    public void getColZero() {
////        Matrix m = new Matrix();
////        assertNotEquals(0, m.getCol());
////    }
//
//    @Test
//    public void getColNegative() {
//        Matrix m = new Matrix();
//        assertNotEquals(-1, m.getCol());
//    }
//
//    @Test
//    public void addMatrices() {
//        Matrix m = new Matrix();
//
//    }
//
//    @Test
//    public void check_non_negative_row() {
//        Matrix m = new Matrix();
//        for(int i = -1; i < 0; i--)
//            assertNotEquals(i,m.row);
//    }
//    @Test
//    public void check_non_negative_col() {
//        Matrix m = new Matrix();
//        for(int i = -1; i < 0; i--)
//            assertNotEquals(i,m.col);
//    }


//    @Test
//    public void getRowNonNegative() {
//        Matrix m = new Matrix();
//        for(int i = -1; i < 0; i--)
//            assertNotEquals(i, m.row);
//    }
//    @Test
//    public void getColNonNegative() {
//        Matrix m = new Matrix();
//        for(int i = -1; i < 0; i--)
//            assertNotEquals(i, m.row);
//    }

    @Test
    public void check_value_negative_test() {
        Matrix m = new Matrix();
        for(int i = -1; i < 0; i--)
            assertEquals(false, m.check_value(i));
    }

    @Test
    public void check_value_zero() {
        Matrix m = new Matrix();
        assertEquals(true, m.check_value(0));
    }

    @Test
    public void check_value_positive() {
        Matrix m = new Matrix();
        for(int i = 1; i > 0; i++)
            assertEquals(true, m.check_value(i));
    }

    @Test
    public void checkdimensionsNegativeRowValue() {
        Matrix m = new Matrix();
        for(int i = -1; i < 0; i--) {
            m.row = i;
            m.col = 0;
            assertEquals(false, m.checkDimensions());
        }
    }
    @Test
    public void checkdimensionsNegativeColValue() {
        Matrix m = new Matrix();
        for(int i = -1; i < 0; i--) {
            m.col = i;
            m.row = 0;
            assertEquals(false, m.checkDimensions());
        }
    }
    @Test
    public void checkdimensionsZeroColZeroRowValue() {
        Matrix m = new Matrix();
        m.col = 0;
        m.row = 0;
        assertEquals(true, m.checkDimensions());
    }
    @Test
    public void checkdimensionsPositiveValues() {
        Matrix m = new Matrix();
        for(int i = 1; i > 0; i++) {
            m.col = i;
            m.row = i;
            assertEquals(true, m.checkDimensions());
        }
    }

    @Test
    public void PrintTestSingleElement() {
        Matrix m = new Matrix();
        m.row = m.col = 1;
        m.initMatirx();
        m.matrix_elements[0][0] = 1;
        assertEquals("1 \n", m.PrintMatrix());
    }

    @Test
    public void PrintTestZeroElements() {
        Matrix m = new Matrix();
        m.row = m.col = 0;
        m.initMatirx();
        assertEquals("", m.PrintMatrix());
    }
    @Test
    public void PrintTestTwoByTwo() {
        Matrix m = new Matrix();
        m.row = m.col = 2;
        m.initMatirx();
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                m.matrix_elements[i][j] = 1;
        assertEquals("1 1 \n1 1 \n", m.PrintMatrix());
    }
    @Test
    public void PrintTestOneByTwo() {
        Matrix m = new Matrix();
        m.row = 1;
        m.col = 2;
        m.initMatirx();
        for(int i = 0; i < m.row; i++)
            for(int j = 0; j < m.col; j++)
                m.matrix_elements[i][j] = 1;
        assertEquals("1 1 \n", m.PrintMatrix());
    }
    @Test
    public void PrintTestTwoByOne() {
        Matrix m = new Matrix();
        m.row = 2;
        m.col = 1;
        m.initMatirx();
        for(int i = 0; i < m.row; i++)
            for(int j = 0; j < m.col; j++)
                m.matrix_elements[i][j] = 1;
        assertEquals("1 \n1 \n", m.PrintMatrix());
    }

    @Test
    public void testAddableFail() {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix c = new Matrix();
        a.row = a.col = 4;
        b.row = b.col = 3;
        assertEquals(false, c.addMatrices(a, b));
    }

    @Test
    public void testAddableSuccess() {
        Matrix a = new Matrix();
        Matrix b = new Matrix();
        Matrix c = new Matrix();
        a.row = a.col = 2;
        b.row = b.col = 2;
        c.col = c.row = 2;
        a.initMatirx();
        b.initMatirx();
        c.initMatirx();
        for(int i = 0; i < a.row; i++)
            for(int j = 0; j < a.col; j++)
                a.matrix_elements[i][j] = 1;
        for(int i = 0; i < a.row; i++)
            for(int j = 0; j < a.col; j++)
                b.matrix_elements[i][j] = 3;
            c.addMatrices(a, b);
            int[][] test_answer = new int[2][2];
            for(int i = 0; i < c.row; i++)
                for(int j = 0; j < c.col; j++)
                    test_answer[i][j] = 4;
            assertArrayEquals(c.matrix_elements, test_answer);
    }
}