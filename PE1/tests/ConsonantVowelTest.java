import org.junit.Test;

import static org.junit.Assert.*;

public class ConsonantVowelTest {
    @Test
    public void onlyVowel_a() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("a vowel", cv.character('a'));
    }

    @Test
    public void onlyVowel_e() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("e vowel", cv.character('e'));
    }

    @Test
    public void onlyVowel_i() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("i vowel", cv.character('i'));
    }

    @Test
    public void onlyVowel_o() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("o vowel", cv.character('o'));
    }

    @Test
    public void onlyVowel_u() {
    }

    @Test
    public void consonant_z() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("z consonant", cv.character('z'));
    }

    @Test
    public void consonant_b() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("b consonant", cv.character('b'));
    }

    @Test
    public void consonant_t() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("t consonant", cv.character('t'));
    }

    @Test
    public void notALetter_4() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("Error. Not a letter.", cv.character('4'));

    }

    @Test
    public void notALetter_7() {
        ConsonantVowel cv = new ConsonantVowel();
        assertEquals("Error. Not a letter.", cv.character('7'));
    }
}