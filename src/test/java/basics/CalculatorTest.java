package basics;

import fundamentals_testing.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(2, 4);

        // then
        assertEquals(6, result);
    }

    @Test
    public void testDivision() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.divide(10, 5);

        // then
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.multiply(2, 5);

        // then
        assertEquals(10, result);
    }

    @Test
    public void testSubtraction() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 3);

        // then
        assertEquals(2, result);
    }
}
