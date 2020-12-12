package advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> travelRoute = new HashSet<>();
        travelRoute.add("Berlin");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.add("Paris");

        travelRoute.remove("Paris");

        if (travelRoute.contains("Lithuania")) {
            System.out.println("Lithuania is in travel route");
        }

        for (String country : travelRoute) {
            System.out.println(country);
        }
    }
}
