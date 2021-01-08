package home_works.HW20201214.deliveries;

import java.math.BigDecimal;

public class Gadget {
    private BigDecimal price;
    private GadgetType gadgetType;
    private Courier courier;

    public Gadget(BigDecimal price, GadgetType gadgetType, Courier courier) {
        this.price = price;
        this.gadgetType = gadgetType;
        this.courier = courier;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public GadgetType getGadgetType() {
        return gadgetType;
    }

    public Courier getCourier() {
        return courier;
    }
}
