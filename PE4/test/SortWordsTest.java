import org.junit.Test;

import static org.junit.Assert.*;

public class SortWordsTest {
    @Test
    public void test_extract_from_blank_string() {
        SortWords sw = new SortWords();
        assertEquals(null, sw.extract_words(""));
    }

    @Test
    public void test_extract_single_word() {
        SortWords sw = new SortWords();
        String[] arr = new String[1];
        arr[0] = "Freddie";
        assertArrayEquals(arr, sw.extract_words("Freddie"));
    }

    @Test
    public void test_extract_extra_spaces_single_word() {
        SortWords sw = new SortWords();
        String[] arr = new String[1];
        arr[0] = "Freddie";
        assertArrayEquals(arr, sw.extract_words("     Freddie  "));
    }
    @Test
    public void test_extract_extra_spaces() {
        SortWords sw = new SortWords();
        String[] arr = new String[5];
        arr[0] = "Freddie";
        arr[1] = "Mercury";
        arr[2] = "is";
        arr[3] = "the";
        arr[4] = "best";
        assertArrayEquals(arr, sw.extract_words("     Freddie  Mercury is the     best  "));
    }

    @Test
    public void test_sentence() {
        SortWords sw = new SortWords();
        String[] arr = new String[5];
        arr[0] = "Freddie";
        arr[1] = "Mercury";
        arr[2] = "is";
        arr[3] = "the";
        arr[4] = "best";
        assertArrayEquals(arr, sw.extract_words("     Freddie  Mercury is the     best  "));
    }

    @Test
    public void test_multiple_sentences() {
        SortWords sw = new SortWords();
        String[] arr = new String[5];
        arr[0] = "Freddie";
        arr[1] = "Mercury";
        arr[2] = "is";
        arr[3] = "the";
        arr[4] = "best";
        assertArrayEquals(arr, sw.extract_words("Freddie\nMercury\nis the best"));
    }

    @Test
    public void test_multiple_sentences_with_extra_spaces() {
        SortWords sw = new SortWords();
        String[] arr = new String[5];
        arr[0] = "Freddie";
        arr[1] = "Mercury";
        arr[2] = "is";
        arr[3] = "the";
        arr[4] = "best";
        assertArrayEquals(arr, sw.extract_words("Freddie     \n     Mercury\nis       the best"));
    }

    @Test
    public void test_multiple_occurence_of_string() {
        SortWords sw = new SortWords();
        String s = "Aye oh, Aye oh, Aye oh, Te do, Te do, Alright !!!!!";
        String[] arr = s.split(" ");
        assertArrayEquals(arr, sw.extract_words(s));
    }
}