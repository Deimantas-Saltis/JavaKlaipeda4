package advanced.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        String location = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced/file_read/Duomenys.txt";

        try (Scanner scanner = new Scanner(new File(location))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Klaida nuskaitant duomenis is failo!");
        }
    }
}
