package home_works.HW20201213.shapes;

public class ShapesMain {

    public static void main(String[] args) {

        Shape circle = new Circle("apskritimas", 1);
        Shape rectangle = new Rectangle("staciakampis", 2, 4);
        Shape rightAngleRectangle = new RightAngleRectangle("statusis trikampis", 2, 6);

        System.out.println("Apskritimo ilgis = " + circle.getPerimeter());
        System.out.println("Apskritimo plotas = " + circle.getArea() + "\n");
        System.out.println("Stataus trikampio plotas = " + rightAngleRectangle.getArea() + "\n");
        System.out.println("Stačiakampio plotas = " + rectangle.getArea());
    }
}
