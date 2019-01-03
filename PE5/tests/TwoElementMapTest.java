import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class TwoElementMapTest {
    @Test
    public void blankMap() {
        Map<String, String> test_input = new HashMap<>();
        Map<String, String> test_answer = new HashMap<>();
        TwoElementMap tem = new TwoElementMap();
        assertEquals(test_answer, tem.modifyMap(test_input));
    }

    @Test
    public void excessElementsMap() {
        Map<String, String> test_input = new HashMap<>() {
            {
                put("val1", "java");
                put("val2", "C");
                put("val3", "C++");
            }
        };
        Map<String, String> test_answer = new HashMap<>();
        TwoElementMap tem = new TwoElementMap();
        assertEquals(test_answer, tem.modifyMap(test_input));
        System.out.println(test_input);
        System.out.println(test_answer);
    }

    @Test
    public void val1Null() {
        Map<String, String> test_input = new HashMap<>() {
            {
                put("val1", "");
                put("val2", "C");
            }
        };
        Map<String, String> test_answer = test_input;
        TwoElementMap tem = new TwoElementMap();
        assertEquals(test_answer, tem.modifyMap(test_input));
    }

    @Test
    public void val2Null() {
        Map<String, String> test_input = new HashMap<>() {
            {
                put("val1", "Java");
                put("val2", "");
            }
        };
        Map<String, String> test_answer = new HashMap<>() {
            {
                put("val1", "");
                put("val2", "Java");
            }
        };
        TwoElementMap tem = new TwoElementMap();
        assertEquals(test_answer, tem.modifyMap(test_input));
    }

    @Test
    public void val1NullVal2Null() {
        Map<String, String> test_input = new HashMap<>() {
            {
                put("val1", "");
                put("val2", "");
            }
        };
        Map<String, String> test_answer = new HashMap<>() {
            {
                put("val1", "");
                put("val2", "");
            }
        };
        TwoElementMap tem = new TwoElementMap();
        assertEquals(test_answer, tem.modifyMap(test_input));
    }

    @Test
    public void val1AndVal2NonNull() {
        Map<String, String> test_input = new HashMap<>() {
            {
                put("val1", "Java");
                put("val2", "C++");
            }
        };
        Map<String, String> test_answer = new HashMap<>() {
            {
                put("val1", "");
                put("val2", "Java");
            }
        };
        TwoElementMap tem = new TwoElementMap();
        assertEquals(test_answer, tem.modifyMap(test_input));
    }
}