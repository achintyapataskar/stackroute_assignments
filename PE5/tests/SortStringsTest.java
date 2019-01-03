import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortStringsTest {
    @Test
    public void emptyStringArray() {
        SortStrings ss = new SortStrings();
        String[] input = new String[0];
        String[] output= new String[0];

        assertArrayEquals(output, ss.sortArray(input));
    }
    @Test
    public void singleElementStringArray() {
        SortStrings ss = new SortStrings();
        String[] input = new String[0];
        String[] output= new String[0];
        assertArrayEquals(output, ss.sortArray(input));
    }
    @Test
    public void allDifferentElementStringArray() {
        SortStrings ss = new SortStrings();
        String str_in = "Bohemian Rhapsody Another one bites the dust Radio Ga Love of my life";
        String str_out= "Bohemian Rhapsody Another one bites the dust Radio Ga Love of my life";
        String[] input = str_in.split(" ");
        String[] output= str_out.split(" ");
        Arrays.sort(output);
        assertArrayEquals(output, ss.sortArray(input));
    }
    @Test
    public void multipleSameElementStringArray() {
        SortStrings ss = new SortStrings();
        String str_in = "Aye oh Aye oh Aye oh Aye oh";
        String str_out = "Aye oh";
        String[] input = str_in.split(" ");
        String[] output= str_out.split(" ");
        Arrays.sort(output);
        assertArrayEquals(output, ss.sortArray(input));
    }

    @Test
    public void oneElementMultipleTimes() {
        SortStrings ss = new SortStrings();
        String str_in = "Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie ";
        String str_out = "Freddie";
        String[] input = str_in.split(" ");
        String[] output= str_out.split(" ");
        Arrays.sort(output);
        assertArrayEquals(output, ss.sortArray(input));
    }
}