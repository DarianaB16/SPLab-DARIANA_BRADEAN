package ro.info.uvt.tema1;

import jakarta.persistence.Entity;

@Entity
public class Image extends BaseElement {

    private String url;

    public Image() {}

    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
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
        System.out.println("Image with name: " + url);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImage(this);
    }
}