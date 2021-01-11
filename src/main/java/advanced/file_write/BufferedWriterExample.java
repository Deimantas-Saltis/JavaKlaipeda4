package advanced.file_write;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) {
        String location = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced/file_write/Rezultatai.txt";
        String text = "Laba diena";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(location))) {
            bw.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
