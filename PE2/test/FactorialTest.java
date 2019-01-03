import org.junit.Test;
import static  org.junit.Assert.*;

public class FactorialTest {
	@Test
	public   void negative() {
		Factorial f = new Factorial();
		assertEquals(0, f.factorial(-5));
		//factorial is not defined for negative numbers.
		//make your function return zero
	}
	@Test
	public   void zero() {
		Factorial f = new Factorial();
		assertEquals(1, f.factorial(0));
		//factorial is defined to be one for zero.
	}
	@Test
	public   void one() {
		Factorial f = new Factorial();
		assertEquals(1, f.factorial(1));
	}
	@Test
	public   void two() {
		Factorial f = new Factorial();
		assertEquals(2, f.factorial(2));
	}
	@Test
	public   void five() {
		Factorial f = new Factorial();
		assertEquals(120, f.factorial(5));
	}
	@Test
	public   void ten() {
		Factorial f = new Factorial();
		assertEquals(3628800, f.factorial(10));
	}
	@Test
	public   void long_negative() {
		Factorial f = new Factorial();
		assertEquals(0, f.long_factorial(-5));
		//factorial is not defined for negative numbers.
		//make your function return zero
	}
	@Test
	public   void long_zero() {
		Factorial f = new Factorial();
		assertEquals(1, f.long_factorial(0));
		//factorial is defined to be one for zero.
	}
	@Test
	public   void long_one() {
		Factorial f = new Factorial();
		assertEquals(1, f.long_factorial(1));
	}
	@Test
	public   void long_two() {
		Factorial f = new Factorial();
		assertEquals(2, f.long_factorial(2));
	}
	@Test
	public   void long_five() {
		Factorial f = new Factorial();
		assertEquals(120, f.long_factorial(5));
	}
	@Test
	public   void long_ten() {
		Factorial f = new Factorial();
		assertEquals(3628800, f.long_factorial(10));
	}
	@Test
	public   void long_sixteen() {
		Factorial f = new Factorial();
		assertEquals(20922789888000L, f.long_factorial(16));
	}
}
