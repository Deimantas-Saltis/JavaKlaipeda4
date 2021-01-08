package home_works.HW20201214.deliveries;

import java.util.HashMap;
import java.util.Map;

public enum GadgetType {
    PHONE("telefonas"),
    LAPTOP("nesiojamas kompiuteris"),
    TV("televizorius"),
    PERSONAL_COMPUTER("kompiuteris"),
    MICRO_CONTROLLER("mikro kontroleris");

    private static final Map<String, GadgetType> BY_NAME = new HashMap<>();
    private final String name;

    static {
        for (GadgetType e : values()) {
            BY_NAME.put(e.name, e);
        }
    }

    GadgetType(String name) {
        this.name = name;
    }

    public static GadgetType valueOfName(String label) {
        return BY_NAME.get(label);
    }
}
