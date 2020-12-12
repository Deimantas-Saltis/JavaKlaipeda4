package advanced.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // key
        // value
        // Map<K,V>
        Map<String, String> countries = new HashMap<>();

        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

        List<String> countryList = new ArrayList<>(countries.values());
        for (String mapValue : countryList) {
            System.out.println(mapValue);
        }

        for (Map.Entry<String, String> country : countries.entrySet()) {
            String countryKey = country.getKey();
            String capital = country.getValue();

            System.out.println(countries.get(countryKey) + " = " + capital);
        }
    }
}
