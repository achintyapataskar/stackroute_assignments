import org.junit.Test;

import javax.sql.RowSetEvent;

import static org.junit.Assert.*;

public class ReverseStringTest {
    @Test
    public void reverseBlankString() {
        ReverseString rs = new ReverseString();
        assertEquals("", rs.reverse(""));
    }

    @Test
    public void reverseSingleCharacter() {
        ReverseString rs = new ReverseString();
        assertEquals("a", rs.reverse("a"));
    }

    @Test
    public void reverseSameCharacter() {
        ReverseString rs = new ReverseString();
        assertEquals("aa", rs.reverse("aa"));
    }

    @Test
    public void reverseDoublecharacter() {
        ReverseString rs = new ReverseString();
        assertEquals("ba", rs.reverse("ab"));
    }

    @Test
    public void reverseLongString() {
        ReverseString rs = new ReverseString();
        assertEquals("zyxwvutsrqponmlkjihgfedcba", rs.reverse("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void reverseShortString() {
        ReverseString rs = new ReverseString();
        assertEquals("dcba", rs.reverse("abcd"));
    }

    @Test
    public void reversePalindromeString() {
        ReverseString rs = new ReverseString();
        assertEquals("abcba", rs.reverse("abcba"));
    }
}