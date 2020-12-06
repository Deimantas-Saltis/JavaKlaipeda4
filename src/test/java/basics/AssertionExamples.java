package basics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AssertionExamples {

    @Test
    public void testAssertEquals() {
        // given
        int firstNum = 5;
        int secondNum = 20;

        // when
        int result = firstNum * secondNum;

        // then
        Assertions.assertEquals(100, result);
        Assertions.assertNotEquals(50, result);
    }

    @Test
    public void testAssertTrueFalse() {
        // given
        int firstNum = 5;
        int secondNum = 20;

        // when
        boolean condition = firstNum == secondNum;

        // then
        Assertions.assertTrue(firstNum != secondNum);
        Assertions.assertFalse(condition);
    }

    @Test
    public void testArrayEquals() {
        // given
        int[] firstArr = {1, 2, 3};
        int[] secondArr = {1, 2, 3};

        // when

        // then
        Assertions.assertArrayEquals(firstArr, secondArr);
    }

    @Test
    public void testAssertNullNotNull() {
        // given
        String emptyText = null;
        String text = "Learning test framework";

        // when

        // then
        Assertions.assertNull(emptyText);
        Assertions.assertNotNull(text);
    }

    @Test
    public void testAssertSame() {
        // given
        String text1 = "abc";
        String text = "abc";

        String text2 = new String("abc");

        // when

        // then
        assertSame(text, text1);
        assertNotSame(text, text2);
    }
}
