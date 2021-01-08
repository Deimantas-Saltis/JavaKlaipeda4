package home_works.HW20201213.deliveries;

import javax.xml.namespace.QName;
import java.time.LocalDate;
import java.util.List;

public class Person extends Location {

    private List<GadgetType> gadgetTypes;
    private LocalDate deliverUntil;
    private boolean willGetDeliveries;

    public Person(String name, String address, List<GadgetType> gadgetTypes, LocalDate deliverUntil) {
        super(name, address);
        this.gadgetTypes = gadgetTypes;
        this.deliverUntil = deliverUntil;
    }

    public List<GadgetType> getGadgetTypes() {
        return gadgetTypes;
    }

    public LocalDate getDeliverUntil() {
        return deliverUntil;
    }

    public boolean isWillGetDeliveries() {
        return willGetDeliveries;
    }

    public void setWillGetDeliveries(boolean willGetDeliveries) {
        this.willGetDeliveries = willGetDeliveries;
    }

    public String toString() {
        return String.format("%s %s will get all deliveries! \n", name, address);
    }
}
