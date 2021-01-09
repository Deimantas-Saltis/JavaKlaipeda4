package home_works.HW20201213.deliveries;

public class Gadget {
    private double price;
    private GadgetType gadgetType;
    private Courier courier;

    public Gadget(double price, GadgetType gadgetType, Courier courier) {
        this.price = price;
        this.gadgetType = gadgetType;
        this.courier = courier;
    }

    public double getPrice() {
        return price;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public Courier getCourier() {
        return courier;
    }
}
