package circle;

import fundamentals_testing.Circle;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void shouldCalculateCirclePerimeter() {
        // given
        Circle circle = new Circle(0.5);

        // when
        double result = circle.calculateCirclePerimeter();

        // then
        Assertions.assertThat(result).isEqualTo(Math.PI);
    }

    @Test
    public void shouldCalculateCircleArea() {
        // given
        Circle circle = new Circle(1);

        // when
        double result = circle.calculateCircleArea();

        // then
        Assertions.assertThat(result).isEqualTo(Math.PI);
    }
}
