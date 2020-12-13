package advanced.generics.example1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);

        GenericBox<String> box1 = new GenericBox<>("text");
        GenericBox<Car> box2 = new GenericBox<>(car);
    }
}
