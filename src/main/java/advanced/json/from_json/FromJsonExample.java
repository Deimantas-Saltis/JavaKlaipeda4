package advanced.json.from_json;

import advanced.json.Employees;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FromJsonExample {

    private static final String FILE_LOCATION = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced/json/example.json";

    public static void main(String[] args) {
        Gson gson = new Gson();

        try (Reader reader = new FileReader(FILE_LOCATION)) {
            // Reading one object
//            Staff staff = gson.fromJson(reader, Staff.class);
//            System.out.println(staff);

            // Reading list of objects
            Employees employees = gson.fromJson(reader, Employees.class);
            System.out.println(employees);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
