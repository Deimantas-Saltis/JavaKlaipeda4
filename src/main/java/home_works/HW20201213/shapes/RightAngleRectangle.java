package home_works.HW20201213.shapes;

public class RightAngleRectangle extends Shape {

    protected int width;
    protected int height;

    public RightAngleRectangle(String shapeDescription, int width, int height) {
        super(shapeDescription);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected double getArea() {
        return (double) height * width / 2;
    }

    @Override
    protected double getPerimeter() {
        return 0;
    }
}
