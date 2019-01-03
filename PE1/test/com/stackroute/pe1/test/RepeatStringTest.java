import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatStringTest {
    @Test
    public void emptyStringZeroN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("", 0));
    }

    @Test
    public void emptyStringNonZeroN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("", 5));
    }

    @Test
    public void emptyStringOneN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("", 1));
    }

    @Test
    public void oneCharacterStringZeroN() {
        RepeatString rs = new RepeatString();
        assertEquals("a", rs.postfix_operation("a", 0));
    }

    @Test
    public void oneCharacterStringOneN() {
        RepeatString rs = new RepeatString();
        assertEquals("aa", rs.postfix_operation("a", 1));
    }

    @Test
    public void oneCharacterStringTwoN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("a", 2));
    }

    @Test
    public void oneCharacterStringFourN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("a", 4));
    }

    @Test
    public void twoCharacterStringZeroN() {
        RepeatString rs = new RepeatString();
        assertEquals("ab", rs.postfix_operation("ab", 0));
    }

    @Test
    public void twoCharacterStringOneN() {
        RepeatString rs = new RepeatString();
        assertEquals("abb", rs.postfix_operation("ab", 1));
    }

    @Test
    public void twoCharacterStringTwoN() {
        RepeatString rs = new RepeatString();
        assertEquals("ababab", rs.postfix_operation("ab", 2));
    }

    @Test
    public void twoCharacterStringThreeN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("ab", 3));
    }

    @Test
    public void negativeN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("ab", -5));
    }

    @Test
    public void largeN() {
        RepeatString rs = new RepeatString();
        assertEquals("", rs.postfix_operation("ab", 3567));
    }
}