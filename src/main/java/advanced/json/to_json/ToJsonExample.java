package advanced.json.to_json;

import advanced.json.Staff;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ToJsonExample {

    private static final String FILE_LOCATION = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced/json/example.json";

    public static void main(String[] args) {
        Staff staff = new Staff();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try (FileWriter writer = new FileWriter(FILE_LOCATION)) {
            gson.toJson(staff, writer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
