package ro.info.uvt.tema1;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authors = new ArrayList<>();

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        add(element);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + "\n");
        System.out.println("Authors:");
        for (Author author : authors) {
            author.print();
        }
        System.out.println();
        for (Element child : children) {
            child.print();
        }
    }
}