import org.junit.Test;

import java.util.StringTokenizer;

import static org.junit.Assert.*;

public class MatchTest {
    @Test
    public void blank_pattern_blank_text() {
        Match m = new Match();
        String[] arr = new String[0];
        assertArrayEquals(arr, m.find_occurences("", ""));
    }

    @Test
    public void blank_pattern_non_blank_text() {
        Match m = new Match();
        String[] arr = new String[0];
        assertArrayEquals(arr, m.find_occurences("", "Bohemian Rhapsody"));
    }

    @Test
    public void non_blan_pattern_blank_text() {
        Match m = new Match();
        String[] arr = new String[0];
        assertArrayEquals(arr, m.find_occurences("Bohemian Rhapsody", ""));
    }

    @Test
    public void found_occurence() {
        Match m = new Match();
        String[] arr = new String[1];
        arr[0] = "Found at: 0-8";
        assertArrayEquals(arr, m.find_occurences("Bohemian", "Bohemian Rhapsody"));
    }

    @Test
    public void not_found_occurence() {
        Match m = new Match();
        String[] arr = new String[0];
        assertArrayEquals(arr, m.find_occurences("Bohemian", "Another one bites the dust"));
    }

    @Test
    public void found_multiple_occurences() {
        Match m = new Match();
        String[] arr = new String[4];
        arr[0] = "Found at: 0-6";
        arr[1] = "Found at: 7-13";
        arr[2] = "Found at: 14-20";
        arr[3] = "Found at: 21-27";
        assertArrayEquals(arr, m.find_occurences("Aye-oh", "Aye-oh Aye-oh Aye-oh Aye-oh te-do te-do Alright !!!!"));
    }
}