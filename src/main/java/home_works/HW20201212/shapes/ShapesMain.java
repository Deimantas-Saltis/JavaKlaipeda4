package home_works.HW20201212.shapes;

public class ShapesMain {

    public static void main(String[] args) {

        Circle circle = new Circle("apskritimas", 5);
        RightAngleRectangle rightAngleRectangle = new RightAngleRectangle("status trikampis", 4, 5);
        Rectangle rectangle = new Rectangle("stačiakampis", 3, 3);

        printResults(circle, rightAngleRectangle, rectangle);
    }

    private static void printResults(Circle circle, RightAngleRectangle rightAngleRectangle, Rectangle rectangle) {
        double circleLength = circleLength(circle);
        int rectangleArea = calculateRectangleArea(rectangle);
        double rightAngleRectangleArea = calculateRightAngleRectangleArea(rightAngleRectangle);

        System.out.println("Apskritimo ilgis = " + circleLength);
        System.out.println("Stataus trikampio plotas = " + rightAngleRectangleArea);
        System.out.println("Stačiakampio plotas = " + rectangleArea);
    }

    private static double calculateRightAngleRectangleArea(RightAngleRectangle rightAngleRectangle) {
        return (double) rightAngleRectangle.getHeight() * rightAngleRectangle.getWidth() / 2;
    }

    private static int calculateRectangleArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getHeight();
    }

    private static double circleLength(Circle circle) {
        return (double) 2 * Math.PI * circle.getRadius();
    }
}
