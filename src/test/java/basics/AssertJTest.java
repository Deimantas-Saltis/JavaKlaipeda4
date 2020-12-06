package basics;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertJTest {

    @Test
    public void testAssertJMatchers() {
        // given
        String text = "abc";
        String[] stringArr = {"abc", "cde", "efg"};

        // when

        // then
        Assertions.assertThat(stringArr)
                .hasSize(3)
                .contains(text)
                .doesNotContain("x");
    }

    @Test
    public void shouldAddTwoNumbers() {
        // given
        int result = 1 + 3;

        // when

        // then
        Assertions.assertThat(result)
                .isEqualTo(4)
                .isNotEqualTo(5)
                .isLessThan(6)
                .isGreaterThan(3)
                .isBetween(0, 10);
    }
}
