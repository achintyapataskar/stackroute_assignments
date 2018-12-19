import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void reverseSingleDigit() {
        Palindrome p = new Palindrome();
        assertEquals(1, p.reverse(1));
    }

    @Test
    public void reverseDifferentDoubleDigit() {
        Palindrome p = new Palindrome();
        assertEquals(21, p.reverse(12));
    }

    @Test
    public void reverseSameDoubleDigit() {
        Palindrome p = new Palindrome();
        assertEquals(11, p.reverse(11));
    }

    @Test
    public void reverseTripleDigit() {
        Palindrome p = new Palindrome();
        assertEquals(123, p.reverse(321));
    }

    @Test
    public void reverseManyDigits() {
        Palindrome p = new Palindrome();
        assertEquals(12345, p.reverse(54321));
    }

}