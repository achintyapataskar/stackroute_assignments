import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountsInStringTest {
    @Test
    public void blankString() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
        };
        assertEquals(test_map, cis.counts(""));
    }

    @Test
    public void singleWordString() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello"));
    }
    @Test
    public void twoWordsString() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello World"));
    }
    @Test
    public void tabDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello\tWorld"));
    }
    @Test
    public void newLineDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello\nWorld"));
    }
    @Test
    public void specialCharacterEmailDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello@World"));
    }
    @Test
    public void specialCharacterExclamationDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello!World"));
    }
    @Test
    public void specialCharacterCommaDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello,World"));
    }

    @Test
    public void specialCharacterAndSpaceDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello ,World"));
    }
    @Test
    public void multipleSpacesDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello         World"));
    }
    @Test
    public void multipleSpecialCharactersDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello,,,World"));
    }
    @Test
    public void multipleSpaceAndSpecialCharactersDelimiter() {
        CountsInString cis = new CountsInString();
        Map<String, Integer> test_map = new HashMap<String, Integer>() {
            {
                put("Hello", 1);
                put("World", 1);
            }
        };
        assertEquals(test_map, cis.counts("Hello     ,,,World"));
    }
}