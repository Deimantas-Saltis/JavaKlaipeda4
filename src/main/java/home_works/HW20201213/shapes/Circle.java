package home_works.HW20201213.shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }

    @Override
    protected double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    protected double getPerimeter() {
        return (double) 2 * Math.PI * radius;
    }
}
