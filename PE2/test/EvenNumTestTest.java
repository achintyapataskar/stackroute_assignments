import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Test
    public void zero() {
        EvenNumTest ent = new EvenNumTest();
        assertEquals(true, ent.isEven(0));
    }

    @Test
    public void one() {
        EvenNumTest ent = new EvenNumTest();
        assertEquals(false, ent.isEven(1));
    }

    @Test
    public void two() {
        EvenNumTest ent = new EvenNumTest();
        assertEquals(true, ent.isEven(2));
    }

    @Test
    public void negativeOne() {
        EvenNumTest ent = new EvenNumTest();
        assertEquals(false, ent.isEven(-1));

    }

    @Test
    public void negativeTwo() {
        EvenNumTest ent = new EvenNumTest();
        assertEquals(true, ent.isEven(-2));
    }
}