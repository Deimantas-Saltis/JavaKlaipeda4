package advanced_coding.workers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WorkersMain {
    private static final String FILE_LOCATION = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced_coding/workers/WorkersData.txt";

    public static void main(String[] args) {
        List<Worker> workers = readDataFromFile();

        System.out.println("Vid darbo uzmokestis: " + averageAge(workers));
        System.out.println("Daugiausiai uzdirbantis darbuotojas: " + biggestSal(workers));
        System.out.println("Jauniausias darbuotojas: " + youngestWorker(workers).getName());
    }

    private static List<Worker> readDataFromFile() {
        List<Worker> workers = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                workers.add(mapWorkerData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return workers;
    }

    private static Worker mapWorkerData(String line) {
        String[] splittedLine = line.split(",");
        return new Worker(
                splittedLine[0],
                Double.parseDouble(splittedLine[1]),
                Integer.parseInt(splittedLine[2]),
                splittedLine[3].toCharArray()[0]
        );
    }

    private static Worker youngestWorker(List<Worker> workers) {
        Worker youngestWorker = workers.get(0);

        for (Worker w : workers) {
            if (w.getAge() < youngestWorker.getAge()) {
                youngestWorker = w;
            }
        }

        return youngestWorker;
    }

    private static double biggestSal(List<Worker> workers) {
        double biggestSalary = workers.get(0).getSalary();

        for (Worker w : workers) {
            biggestSalary = Math.max(w.getSalary(), biggestSalary);
        }
        return biggestSalary;
    }

    private static double averageAge(List<Worker> workers) {
        int allSall = 0;

        for (Worker w : workers) {
            allSall += w.getAge();
        }

        return (double) allSall / workers.size();
    }
}
