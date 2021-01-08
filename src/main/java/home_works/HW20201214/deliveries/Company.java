package home_works.HW20201214.deliveries;

public class Company extends Location {

    private Gadget gadget;

    public Company(String name, String address, Gadget gadget) {
        super(name, address);
        this.gadget = gadget;
    }

    public Gadget getGadget() {
        return gadget;
    }

    public String toString() {
        return String.format("Company with name: %s has most expensive gadget with price %f \n", name, gadget.getPrice());
    }
}
