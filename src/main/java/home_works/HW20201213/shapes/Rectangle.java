package home_works.HW20201213.shapes;

public class Rectangle extends RightAngleRectangle {

    public Rectangle(String shapeDescription, int width, int height) {
        super(shapeDescription, width, height);
    }

    @Override
    protected double getArea() {
        return height * width;
    }
}
