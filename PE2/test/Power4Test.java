import org.junit.Test;
import static org.junit.Assert.*;

public class Power4Test {
	@Test
	public void raisedToFourTestNegative() {
		Power4 p = new Power4();
		assertEquals(0, p.raised_to_4(-5));
		//this function should return zero when it receives negative input
	}
	@Test
	public void raisedToFourTestZero() {
		Power4 p = new Power4();
		assertEquals(1, p.raised_to_4(0));
	}
	@Test
	public void raisedToFourTestOne() {
		Power4 p = new Power4();
		assertEquals(4, p.raised_to_4(1));
	}
	@Test
	public void raisedToFourTestTwo() {
		Power4 p = new Power4();
		assertEquals(16, p.raised_to_4(2));
	}
	@Test
	public void raisedToFourTestLargest() {
		Power4 p = new Power4();
		assertEquals(4611686018427387904L, p.raised_to_4(31));
	}
	@Test
	public void raisedToFourTestTooBig() {
		Power4 p = new Power4();
		assertEquals(0, p.raised_to_4(32));
	}
}
