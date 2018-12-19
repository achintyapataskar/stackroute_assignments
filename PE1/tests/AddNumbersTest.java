import org.junit.Test;

import static org.junit.Assert.*;

public class AddNumbersTest {
    @Test
    public void singleNumber() {
        AddNumbers test_object = new AddNumbers();
        int c = test_object.sum("5");
        assertEquals(5, c);
    }

    @Test
    public void twoNumbers() {
        AddNumbers test_object = new AddNumbers();
        int c = test_object.sum("5 6");
        assertEquals(11, c);
    }

    @Test
    public void threeNumbers() {
        AddNumbers test_object = new AddNumbers();
        int c = test_object.sum("5 6 7");
        assertEquals(18, c);
    }

    @Test
    public void oneNonNumber() {
        AddNumbers test_object = new AddNumbers();
        int c = test_object.sum("a");
        assertEquals(0, c);
    }

    @Test
    public void numberAndNonNumber() {
    }

    @Test
    public void numberAtEnd() {
        AddNumbers test_object = new AddNumbers();
        int c = test_object.sum("6 a");
        assertEquals(6, c);
    }
}