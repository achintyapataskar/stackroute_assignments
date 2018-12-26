import org.junit.Test;

import java.sql.Struct;

import static org.junit.Assert.*;

public class StudentMarksTest {
    @Test
    public void negativeNumberOfStudents() {
        StudentMarks sm = new StudentMarks();
        assertEquals(false, sm.initStuGrades(-5));
    }

    @Test
    public void zeroNumberOfStudents() {
        StudentMarks sm = new StudentMarks();
        assertEquals(false, sm.initStuGrades(0));
    }

    @Test
    public void nonZeroNumberOfStudents() {
        StudentMarks sm = new StudentMarks();
        assertEquals(true, sm.initStuGrades(5));
    }

    @Test
    public void negativeMarks() {
        StudentMarks sm = new StudentMarks();
        assertEquals(false, sm.check_marks(-5));
    }

    @Test
    public void zeroMarks() {
        StudentMarks sm = new StudentMarks();
        assertEquals(true, sm.check_marks(0));
    }

    @Test
    public void fiftyMarks() {
        StudentMarks sm = new StudentMarks();
        assertEquals(true, sm.check_marks(50));
    }

    @Test
    public void hundredMarks() {
        StudentMarks sm = new StudentMarks();
        assertEquals(true, sm.check_marks(100));
    }

    @Test
    public void moreThanHundredMarks() {
        StudentMarks sm = new StudentMarks();
        assertEquals(false, sm.check_marks(150));
    }
}