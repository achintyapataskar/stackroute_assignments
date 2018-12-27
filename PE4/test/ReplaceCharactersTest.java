import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {

    @Test
    public void string_mix() {
        ReplaceCharacters rc = new ReplaceCharacters();
        assertEquals("Bohemian Rhapsofy", rc.replace("Bohemian Rhapsody"));
    }

    @Test
    public void string_with_only_replaceable_characters() {
        ReplaceCharacters rc = new ReplaceCharacters();
        assertEquals("fffftttfffftftfftt", rc.replace("ddddlllddddldlddll"));
    }

    @Test
    public void string_with_replaceable_characters() {
        ReplaceCharacters rc = new ReplaceCharacters();
        assertEquals("abcfefghijktmnopqrstuvwxyz", rc.replace("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void string_no_replaceable_characters() {
        ReplaceCharacters rc = new ReplaceCharacters();
        assertEquals("abcefghijkmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", rc.replace("abcefghijkmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void blank_string() {
        ReplaceCharacters rc = new ReplaceCharacters();
        assertEquals("", rc.replace(""));
    }
}