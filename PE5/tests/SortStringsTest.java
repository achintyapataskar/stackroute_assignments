import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortStringsTest {
    private SortStrings ss;
    @Before
    public void initObjectOfSortStrings() {
        ss = new SortStrings();

    }
    @Test
    public void emptyStringArray() {
        String[] input = new String[0];
        String[] output= new String[0];

        assertArrayEquals(output, ss.sortArray(input));
    }
    @Test
    public void singleElementStringArray() {
        String[] input = new String[0];
        String[] output= new String[0];
        assertArrayEquals(output, ss.sortArray(input));
    }
    @Test
    public void allDifferentElementStringArray() {
        String str_in = "Bohemian Rhapsody Another one bites the dust Radio Ga Love of my life";
        String str_out= "Bohemian Rhapsody Another one bites the dust Radio Ga Love of my life";
        String[] input = str_in.split(" ");
        String[] output= str_out.split(" ");
        Arrays.sort(output);
        assertArrayEquals(output, ss.sortArray(input));
    }
    @Test
    public void multipleSameElementStringArray() {
        String str_in = "Aye oh Aye oh Aye oh Aye oh";
        String str_out = "Aye oh";
        String[] input = str_in.split(" ");
        String[] output= str_out.split(" ");
        Arrays.sort(output);
        assertArrayEquals(output, ss.sortArray(input));
    }

    @Test
    public void oneElementMultipleTimes() {
        String str_in = "Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie Freddie ";
        String str_out = "Freddie";
        String[] input = str_in.split(" ");
        String[] output= str_out.split(" ");
        Arrays.sort(output);
        assertArrayEquals(output, ss.sortArray(input));
    }
}