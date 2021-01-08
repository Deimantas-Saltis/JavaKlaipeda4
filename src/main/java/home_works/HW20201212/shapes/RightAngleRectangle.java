package home_works.HW20201212.shapes;

public class RightAngleRectangle extends Shape {

    private int width;
    private int height;

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
}
