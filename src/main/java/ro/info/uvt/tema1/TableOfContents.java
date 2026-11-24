package ro.info.uvt.tema1;

import jakarta.persistence.Entity;

@Entity
public class TableOfContents extends BaseElement {

    public TableOfContents() {}

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
        System.out.println("Table of Contents");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}