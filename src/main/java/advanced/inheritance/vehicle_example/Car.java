package advanced.inheritance.vehicle_example;

public class Car extends Vehicle {

    private String model;

    public Car(String model, int maxSpeed) {
        super(maxSpeed);
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                "maxSpeed='" + maxSpeed +
                '}';
    }

    @Override
    public int vehicleMaxSpeed() {
        return maxSpeed * 10;
    }
}
