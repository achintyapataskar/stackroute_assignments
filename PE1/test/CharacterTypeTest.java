import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {
    @Test
    public void lowerCaseLetter() {
        CharacterType test_object = new CharacterType();
        assertEquals("Upper Case Character", test_object.type('A'));
    }

    @Test
    public void upperCaseLetter() {
        CharacterType test_object = new CharacterType();
        assertEquals("Lower Case Character", test_object.type('a'));
    }

    @Test
    public void digit() {
        CharacterType test_object = new CharacterType();
        assertEquals("Digit", test_object.type('5'));
    }

    @Test
    public void specialSymbol() {
        CharacterType test_object = new CharacterType();
        assertEquals("Special Symbol", test_object.type('$'));
    }

    @Test
    public void specialSymbol_caret() {
        CharacterType test_object = new CharacterType();
        assertEquals("Special Symbol", test_object.type('^'));
    }
}