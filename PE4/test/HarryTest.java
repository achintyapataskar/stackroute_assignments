import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {


    @Test
    public void blank_string() {
        Harry h = new Harry();
        assertEquals(false, h.find(""));
    }

    @Test
    public void harry_not_present_string() {
        Harry h = new Harry();
        assertEquals(false, h.find("I heard it on my radio."));
    }

    @Test
    public void only_harry_present() {
        Harry h = new Harry();
        assertEquals(true, h.find("Harry"));
    }

    @Test
    public void harry_present() {
        Harry h = new Harry();
        assertEquals(true, h.find("Harry hai yahan"));
    }

    @Test
    public void harry_not_present_sentence() {
        Harry h = new Harry();
        assertEquals(false, h.find("Henry is here"));
    }
}