import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void sumOfEvenDigitsOneEvenDigit() {
        Sort st = new Sort();
        assertEquals(2, st.sum_of_even_digits(123));
    }

    @Test
    public void sumOfEvenDigitsTwoEvenDigits() {
        Sort st = new Sort();
        assertEquals(4, st.sum_of_even_digits(1223));
    }
    public void sumOfEvenDigitsZeroEvenDigits() {
        Sort st = new Sort();
        assertEquals(0, st.sum_of_even_digits(331));
    }
}