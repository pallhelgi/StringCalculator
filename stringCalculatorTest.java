package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class stringCalculatorTest {

	@Test
	public void testEmptyString() {

		assertEquals(0, stringCalculator.add(""));
	}
}