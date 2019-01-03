import org.junit.Test;

import static org.junit.Assert.*;

public class TomTest {
    @Test
    public void negativeNumber() {
        Tom t = new Tom();
        assertEquals("", t.number_name(-5));
    }

    @Test
    public void zeroNumber() {
        Tom t = new Tom();
        assertEquals("", t.number_name(0));
    }

    @Test
    public void numberLessThanFive() {
        Tom t = new Tom();
        assertEquals("", t.number_name(3));
    }

    @Test
    public void numberLessThanTen() {
        Tom t = new Tom();
        assertEquals("", t.number_name(9));
    }

    @Test
    public void numberLessThanTwenty() {
        Tom t = new Tom();
        assertEquals("", t.number_name(15));
    }

    @Test
    public void numberTwenty() {
        Tom t = new Tom();
        assertEquals("Jerry", t.number_name(20));
    }

    @Test
    public void numberThirty() {
        Tom t = new Tom();
        assertEquals("Jerry", t.number_name(30));

    }

    @Test
    public void oddNumber() {

        Tom t = new Tom();
        assertEquals("Tom", t.number_name(23));
    }

    @Test
    public void evenNumber() {
        Tom t = new Tom();
        assertEquals("Jerry", t.number_name(26));
    }
}