package advanced.json;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Staff {

    private String name;
    private int age;
    private String[] position;
    private List<String> skills;
    private Map<String, Double> salary;

    public Staff() {
        this.name = "John";
        this.age = 24;
        this.position = new String[]{"CTO", "FOUNDER", "Director"};
        this.skills = Arrays.asList("Java", "Kotlin", "JavaScript");
        this.salary = new HashMap<String, Double>() {{
            put("Monthly", 20.4);
            put("Yearly", 400.5);
        }};
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position=" + Arrays.toString(position) +
                ", skills=" + skills +
                ", salary=" + salary +
                '}';
    }
}
