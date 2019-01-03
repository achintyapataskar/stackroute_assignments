import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest {
    @Test
    public void emptyArrayMinimum() {
        Grades g = new Grades();
        int[] arr = new int[0];
        assertEquals(0, g.min(arr));
    }

    @Test
    public void emptyArrayMaximum() {
        Grades g = new Grades();
        int[] arr = new int[0];
        assertEquals(0, g.max(arr));
    }

    @Test
    public void emptyArrayAverage() {
        Grades g = new Grades();
        int[] arr = new int[0];
        assertEquals(0.0, g.average(arr), 0);
    }

    @Test
    public void oneElementArrayMinimum() {
        Grades g = new Grades();
        int[] arr = new int[1];
        arr[0] = 4;
        assertEquals(4, g.min(arr));
    }
    @Test
    public void oneElementArrayMaximum() {
        Grades g = new Grades();
        int[] arr = new int[1];
        arr[0] = 4;
        assertEquals(4, g.max(arr));
    }
    @Test
    public void oneElementArrayAverage() {
        Grades g = new Grades();
        int[] arr = new int[1];
        arr[0] = 4;
        assertEquals(4, g.average(arr), 0);
    }

    @Test
    public void twoElementArrayMinimum() {
        Grades g = new Grades();
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 3;
        assertEquals(1, g.min(arr));
    }

    @Test
    public void twoElementArrayMaximum() {
        Grades g = new Grades();
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 3;
        assertEquals(3, g.max(arr));
    }

    @Test
    public void twoElementArrayAverage() {
        Grades g = new Grades();
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 3;
        assertEquals(2, g.average(arr), 0);
    }

    @Test
    public void twoElementArraySameElementsMinimum() {
        Grades g = new Grades();
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;
        assertEquals(1, g.min(arr), 0);
    }
    @Test
    public void twoElementArraySameElementsMaximum() {
        Grades g = new Grades();
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;
        assertEquals(1, g.max(arr), 0);
    }
    @Test
    public void twoElementArraySameElementsAverage() {
        Grades g = new Grades();
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 1;
        assertEquals(1, g.average(arr), 0);
    }

    @Test
    public void negativeGradesTestGrades() {
        Grades g = new Grades();
        assertEquals(-1, g.test_grades(-5));
    }
    @Test
    public void veryLargeGradesTestGrades() {
        Grades g = new Grades();
        assertEquals(-1, g.test_grades(10000));
    }
    @Test
    public void zeroGradesTestGrades() {
        Grades g = new Grades();
        assertEquals(0, g.test_grades(0));
    }
    @Test
    public void fiftyGradesTestGrades() {
        Grades g = new Grades();
        assertEquals(0, g.test_grades(50));
    }

    @Test
    public void hunderedGradesTestGrades() {
        Grades g = new Grades();
        assertEquals(0, g.test_grades(100));
    }

    @Test
    public void moreThanHundredGradesTestGrades() {
        Grades g = new Grades();
        assertEquals(-1, g.test_grades(1000));
    }

    @Test
    public void generalTestMinimum() {
        Grades g = new Grades();
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        assertEquals(1, g.min(arr));
    }
    @Test
    public void generalTestMaximum() {
        Grades g = new Grades();
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        assertEquals(4, g.max(arr));
    }
    @Test
    public void generalTestAverage() {
        Grades g = new Grades();
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        assertEquals(2.5, g.average(arr), 0.0);
    }
}