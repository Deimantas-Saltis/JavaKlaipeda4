package home_works.HW20201212.shapes;

import java.util.Objects;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
