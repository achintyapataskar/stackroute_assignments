import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {
    @Test
    public void reverseBlank() {
        ReversePalindrome rp = new ReversePalindrome();
        assertEquals("", rp.reverse_string(""));
    }

    @Test
    public void reverseSingleCharacter() {
        ReversePalindrome rp = new ReversePalindrome();
        assertEquals("a", rp.reverse_string("a"));
    }

    @Test
    public void reverseTwoSameCharacters() {
        ReversePalindrome rp = new ReversePalindrome();
        assertEquals("aa", rp.reverse_string("aa"));
    }

    @Test
    public void reverseNonEmptyString() {
        ReversePalindrome rp = new ReversePalindrome();
        assertEquals("abc", rp.reverse_string("cba"));
    }

    @Test
    public void reverseLongString() {
        ReversePalindrome rp = new ReversePalindrome();
        assertEquals("abcdefgh", rp.reverse_string("hgfedcba"));
    }

    @Test
    public void reverseLongSameCharacterString() {
        ReversePalindrome rp = new ReversePalindrome();
        assertEquals("ababcdef", rp.reverse_string("fedcbaba"));
    }

}