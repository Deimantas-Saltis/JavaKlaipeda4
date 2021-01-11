package advanced_coding.book_author;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookAndAuthorsMain {

    private static final String FILE_LOCATION = "/home/deimantas/IdeaProjects/SDA/JavaKlaipeda4/src/main/java/advanced_coding/book_author/BooksData.txt";

    public static void main(String[] args) {
        List<Book> books = readDataFromFile();

        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    private static List<Book> readDataFromFile() {
        List<Book> books = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                books.add(mapBookData(line));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Ivyko klaida randant faila arba skaitant duomenis!");
            System.out.println(e.getMessage());
        }
        return books;
    }

    private static Book mapBookData(String line) {
        String[] splittedLine = line.split(";");
        return new Book(
                splittedLine[0],
                mapAuthorsData(splittedLine[1]),
                Double.parseDouble(splittedLine[2]),
                Integer.parseInt(splittedLine[3])
        );
    }

    private static List<Author> mapAuthorsData(String authorsData) {
        List<Author> authors = new ArrayList<>();
        String[] splittedAuthorsData = authorsData.split("-");

        for (String author : splittedAuthorsData) {
            String[] authorData = author.split(",");
            authors.add(new Author(
                    authorData[0],
                    authorData[1],
                    authorData[2]
            ));
        }
        return authors;
    }
}
