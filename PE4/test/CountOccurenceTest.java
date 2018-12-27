import org.junit.Test;

import static org.junit.Assert.*;

public class CountOccurenceTest {
    @Test
    public void blank_string() {
        CountOccurence co = new CountOccurence();
        assertEquals(0, co.count_char('a', ""));
    }

    @Test
    public void character_occured_single_word() {
        CountOccurence co = new CountOccurence();
        assertEquals(2, co.count_char('a', "Bohemian Rhapsody"));
    }

    @Test
    public void character_not_occured() {
        CountOccurence co = new CountOccurence();
        assertEquals(0, co.count_char('a', "Love of my life"));
    }
}