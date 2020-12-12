package advanced.inheritance.vehicle_example;

public class InheritanceMainExample {

    public static void main(String[] args) {
        Car myCar = new Car("Volvo", 50);
        System.out.println(myCar.toString());
        System.out.println(myCar.vehicleMaxSpeed());

//        Can't initialize abstract class
//        Vehicle vehicle = new Vehicle()
    }
}
