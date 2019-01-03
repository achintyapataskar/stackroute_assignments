import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringArrayToMapTest {
    private StringArrayToMap stm;
    @Before
    public void initObjectOfStringArrayToMap() {
        stm = new StringArrayToMap();
    }
    @Test
    public void emptyArrayCreateMap() {
        Map<String, Boolean> m = new HashMap<>();
        String[] input = new String[0];
        assertEquals(m, stm.createMap(input));
    }

    @Test
    public void singleElementArray() {
        StringArrayToMap stm = new StringArrayToMap();
        Map<String, Boolean> m = new HashMap<>() {
            {
                put("Show", false);
            }
        };
        String[] input = new String[1];
        input[0] = "Show";
        assertEquals(m, stm.createMap(input));
    }

    @Test
    public void allDifferentArrayElements() {
        Map<String, Boolean> m = new HashMap<>() {
            {
                put("The", false);
                put("Show", false);
                put("Must", false);
                put("Go", false);
                put("On", false);
            }
        };
        String[] input = new String[5];
        input[0] = "The";
        input[1] = "Show";
        input[2] = "Must";
        input[3] = "Go";
        input[4] = "On";
        assertEquals(m, stm.createMap(input));
    }

    @Test
    public void nonDifferentArrayElements() {
        Map<String, Boolean> m = new HashMap<>() {
            {
                put("Aye", true);
                put("Oh", true);
                put("te", true);
                put("do", true);
            }
        };
        String input_string = "Aye Oh Aye Oh Aye Oh te do te do";
        String[] input = input_string.split(" ");

/*        input[0] = "Aye";
 *       input[1] = "Oh";
 *       input[2] = "Aye";
 *       input[3] = "Oh";
 *       input[4] = "Aye";
 *       input[5] = "Oh";
 *       input[6] = "te";
 *       input[7] = "do";
 *       input[8] = "te";
 *       input[9] = "do";*/
        assertEquals(m, stm.createMap(input));
    }

    @Test
    public void mixDifferentNonDifferent() {
        Map<String, Boolean> m = new HashMap<>() {
            {
                put("All", false);
                put("We", false);
                put("hear", false);
                put("is", false);
                put("Radio", true);
                put("Ga", true);
                put("Radio", true);
                put("Goo", true);
            }
        };
        String input_string = "All We hear is Radio Ga Ga Radio Goo Goo";
        String[] input = input_string.split(" ");
        assertEquals(m, stm.createMap(input));
    }

    @Test
    public void multipleCasesForCharacters() {
        Map<String, Boolean> m = new HashMap<>() {
            {
                put("All", false);
                put("We", false);
                put("hear", false);
                put("is", false);
                put("Radio", true);
                put("Ga", false);
                put("ga", false);
                put("Radio", true);
                put("Goo", false );
                put("goo", false );
            }
        };
        String input_string = "All We hear is Radio Ga ga Radio Goo goo";
        String[] input = input_string.split(" ");
        assertEquals(m, stm.createMap(input));
    }

    @Test
    public void singleCharacters() {
        Map<String, Boolean> m = new HashMap<>() {
            {
                put("A", false);
                put("a", false);
                put("B", true);
                put("b", true);
            }
        };
        String input_string = "A a B B b b b";
        String[] input = input_string.split(" ");
        assertEquals(m, stm.createMap(input));
    }
}