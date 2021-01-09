package advanced.file_read.buffered_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced/file_read/Duomenys.txt");
            BufferedReader br = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();
            String line = null;

//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }

            do {
                line = br.readLine();
                if (line != null) {
                    stringBuilder.append(line);
                }
            } while (line != null);

            System.out.println(stringBuilder.toString());

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Failas nebuvo rastas!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
