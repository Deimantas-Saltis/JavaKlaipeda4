package home_works.HW20201214.polygon;

public interface RegularPolygon {

    int getNumSides();

    int getSideLength();

    static int totalSides(int[] sides) {
        int sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    default int getPerimeter(int n, int length) {
        return n * length;
    }

    default double getInteriorAngle(int n) {
        return (n - 2) * 180;
    }
}
