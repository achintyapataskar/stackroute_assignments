import org.junit.Test;

import java.io.*;
import java.util.Objects;

import static org.junit.Assert.*;

public class TransposeTest {
    @Test
    public void test_transpose_null_string() {
        //the transpose of a null string is a null string
        Transpose t = new Transpose();
        assertEquals("", t.transpose(""));
    }

    @Test
    public void test_transpose_one_character() {
        Transpose t = new Transpose();
        assertEquals("a", t.transpose("a"));
    }

    @Test
    public void test_transpose_one_word() {
        Transpose t = new Transpose();
        assertEquals("drow", t.transpose("word"));
    }

    @Test
    public void test_transpose_multiple_words_two() {
        Transpose t = new Transpose();
        assertEquals("xuniL utnubU", t.transpose("Linux Ubuntu"));
    }

    @Test
    public void test_transpose_multiple_words_sentence() {
        Transpose t = new Transpose();
        assertEquals("ytpmE ,secaps tahw era ew gnivil ?rof", t.transpose("Empty spaces, what are we living for?"));
    }

    @Test
    public void test_reverse_null_string() {
        Transpose t = new Transpose();
        assertEquals("", t.reverse(""));
    }

    @Test
    public void test_reverse_single_character() {
        Transpose t = new Transpose();
        assertEquals("a", t.reverse("a"));
    }
    @Test
    public void test_reverse_word() {
        Transpose t = new Transpose();
        assertEquals("abc", t.reverse("cba"));
    }

    @Test
    public void test_reverse_sentence() {
        Transpose t = new Transpose();
        assertEquals(".maerd a evah I", t.reverse("I have a dream."));
    }

    @Test
    public void test_file_content() throws FileNotFoundException, IOException {
        Transpose t = new Transpose();
        File input_file = new File("test_files/transpose.txt");
        BufferedReader br = new BufferedReader(new FileReader(input_file));
        String test_string, input_string;
        while((input_string = br.readLine()) != null) {
            test_string = br.readLine();
            assertEquals(test_string, t.transpose(input_string));
        }
    }
}