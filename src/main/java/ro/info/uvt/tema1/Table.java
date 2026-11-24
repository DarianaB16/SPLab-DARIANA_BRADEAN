package ro.info.uvt.tema1;

import jakarta.persistence.Entity;

@Entity
public class Table extends BaseElement {

    private String title;

    public Table() {}

    public Table(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void add(Element element) {}

    @Override
    public void remove(Element element) {}

    @Override
    public Element get(int index) {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Table: " + title);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}