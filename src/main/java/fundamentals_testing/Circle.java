package fundamentals_testing;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCirclePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateCircleArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
