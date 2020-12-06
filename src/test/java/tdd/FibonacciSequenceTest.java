package tdd;

import fundamentals_testing.FibonacciSequence;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciSequenceTest {

    @Test
    public void shouldReturnZeroForFirstElement() {
        // given
        FibonacciSequence fibonacci = new FibonacciSequence();

        // when
        int result = fibonacci.getValue(0);

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void shouldReturnOneForSecondElement() {
        // given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();

        // when
        int result = fibonacciSequence.getValue(1);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void shouldReturnFibonacciNumber() {
        // given
        FibonacciSequence fibonacciSequence = new FibonacciSequence();

        // when
        int result = fibonacciSequence.getValue(6);

        // then
        Assertions.assertThat(result).isEqualTo(8);
    }
}
