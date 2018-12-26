import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveTest {
    @Test
    public void badInputLessThanSevenNumbers() {
        Consecutive c = new Consecutive();
        c.input = "1,2,3";
//        String[] tokens = c.input.split(",");
        assertEquals(false, c.test_input());
    }

    @Test
    public void badInputMoreThanSevenNumbers() {
        Consecutive c = new Consecutive();
        c.input = "1,2,3,4,5,6,7,8,9";
//        String[] tokens = c.input.split(",");
        assertEquals(false, c.test_input());
    }

    @Test
    public void goodInput() {
        Consecutive c = new Consecutive();
        c.input = "1,2,3,4,5,6,7";
//        String[] tokens = c.input.split(",");
        assertEquals(true, c.test_input());
    }

    @Test
    public void isConsecutive() {
        Consecutive c = new Consecutive();
        c.input = "1,2,3,4,5,6,7";
//        String[] tokens = c.input.split(",");
        assertEquals(true, c.test_consecutive());
    }
    @Test
    public void isNotConsecutive() {
        Consecutive c = new Consecutive();
        c.input = "1,9,3,4,5,6,7";
//        String[] tokens = c.input.split(",");
        assertEquals(false, c.test_consecutive());
    }
}