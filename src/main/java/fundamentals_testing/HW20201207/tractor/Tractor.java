package fundamentals_testing.HW20201207.tractor;

import java.time.LocalDate;

public class Tractor {

    private String tractorMaker;
    private String model;
    private int tankSize;
    private LocalDate make;
    private double price;

    public Tractor(String tractorMaker, String model, int tankSize, LocalDate make, double price) {
        this.tractorMaker = tractorMaker;
        this.model = model;
        this.tankSize = tankSize;
        this.make = make;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getTankSize() {
        return tankSize;
    }

    public LocalDate getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "tractorMaker=" + tractorMaker +
                ", model='" + model + '\'' +
                ", tankSize=" + tankSize +
                ", make=" + make +
                ", price=" + price +
                '}';
    }
}