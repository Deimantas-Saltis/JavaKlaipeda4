package advanced_coding.book_author;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private double price;
    private int qnt;

    public Book(String title, List<Author> authors, double price, int qnt) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                ", qnt=" + qnt +
                '}';
    }
}
