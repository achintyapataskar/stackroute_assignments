import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {
    @Test
    public void isVowelFailureTest() {
        Vowels v = new Vowels();
        assertEquals(false, v.isVowel('F'));
        assertEquals(false, v.isVowel('T'));
        assertEquals(false, v.isVowel('t'));
        assertEquals(false, v.isVowel('x'));
        assertEquals(false, v.isVowel(';'));
    }

    @Test
    public void isVowel_a() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('a'));
    }
    @Test
    public void isVowel_e() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('e'));
    }
    @Test
    public void isVowel_i() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('i'));
    }
    @Test
    public void isVowel_o() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('o'));
    }
    @Test
    public void isVowel_u() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('u'));
    }
    @Test
    public void isVowel_A() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('A'));
    }
    @Test
    public void isVowel_E() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('E'));
    }
    @Test
    public void isVowel_I() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('I'));
    }
    @Test
    public void isVowel_O() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('O'));
    }
    @Test
    public void isVowel_U() {
        Vowels v = new Vowels();
        assertEquals(true, v.isVowel('U'));
    }

    @Test
    public void removeVowelsAllVowels() {
        Vowels v = new Vowels();
        assertEquals("", v.remove_vowels("aeiouAEIOU"));
    }

    @Test
    public void removeVowelsAllConsonants() {
        Vowels v = new Vowels();
        assertEquals("dffhgl", v.remove_vowels("dffhgl"));
    }

    @Test
    public void removeVowelsMix() {
        Vowels v = new Vowels();
        assertEquals("lv f my lf, dn't lv m.", v.remove_vowels("love of my life, don't leave me."));
    }
}