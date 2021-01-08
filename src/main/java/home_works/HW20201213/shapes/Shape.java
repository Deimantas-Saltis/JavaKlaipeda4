package home_works.HW20201213.shapes;

public abstract class Shape {
    protected String shapeDescription;

    public Shape(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public String getShapeDescription() {
        return shapeDescription;
    }

    protected abstract double getArea();

    protected abstract double getPerimeter();
}
