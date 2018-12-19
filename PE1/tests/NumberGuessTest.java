import org.junit.Test;

import static org.junit.Assert.*;

public class NumberGuessTest {
    @Test
    public void correctGuess() {
        NumberGuess ng = new NumberGuess();
        assertEquals("Correct Guess", ng.nature_of_the_number(22, 22));
    }

    @Test
    public void lesserGuess() {
        NumberGuess ng = new NumberGuess();
        assertEquals("Guess is lesser than number", ng.nature_of_the_number(2, 22));
    }

    @Test
    public void greaterGuess() {
        NumberGuess ng = new NumberGuess();
        assertEquals("Guess is greater than number", ng.nature_of_the_number(52, 22));
    }
}