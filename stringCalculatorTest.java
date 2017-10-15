package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class stringCalculatorTest {

	@Test
	public void testEmptyString() {

		assertEquals(0, stringCalculator.add(""));
	}

	@Test
	public void testOneNumber() {

		assertEquals(1, stringCalculator.add("1"));
	}

	@Test
	public void testTwoNumbers() {

		assertEquals(3, stringCalculator.add("1,2"));
	}

	@Test
	public void testThreeNumbers() {

		assertEquals(6, stringCalculator.add("1,2,3"));
	}

	@Test
	public void testAlotOfNumbers() {

		assertEquals(45, stringCalculator.add("1,2,3,4,5,6,7,8,9"));
	}
}