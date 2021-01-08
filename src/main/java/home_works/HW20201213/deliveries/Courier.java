package home_works.HW20201213.deliveries;

import java.time.LocalDate;

public class Courier extends Location {

    private LocalDate deliveryDate;

    public Courier(String name, String address, LocalDate deliveryDate) {
        super(name, address);
        this.deliveryDate = deliveryDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
}
