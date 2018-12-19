import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    @Test
    public void numberZero() {
        Pattern pt = new Pattern();
        assertEquals("", pt.ans(0));
    }

    @Test
    public void numberOne() {
        Pattern pt = new Pattern();
        assertEquals("1", pt.ans(1));
    }

    @Test
    public void numberTwo() {
        Pattern pt = new Pattern();
        assertEquals("1 2 2", pt.ans(2));
    }

}