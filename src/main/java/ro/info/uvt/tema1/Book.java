package ro.info.uvt.tema1;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> elements = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + title);
        for (Author author : authors) {
            author.print();
        }
        for (Element element : elements) {
            element.print();
        }
    }

    public void accept(Visitor visitor) {
        visitor.visitBook(this);
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}