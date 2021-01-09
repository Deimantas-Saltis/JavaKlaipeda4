package advanced.file_read.buffered_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample2 {

    public static void main(String[] args) {
        String fileLocation = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced/file_read/Duomenys.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileLocation))) {
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nebuvo rastas!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
