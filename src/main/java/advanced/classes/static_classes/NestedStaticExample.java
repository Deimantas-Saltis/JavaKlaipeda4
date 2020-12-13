package advanced.classes.static_classes;

public class NestedStaticExample {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(5);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.upgrade(bicycle);
        System.out.println(bicycle.getMaxSpeed());
    }
}
