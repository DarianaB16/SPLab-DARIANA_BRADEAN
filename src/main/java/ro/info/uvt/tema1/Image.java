package ro.info.uvt.tema1;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void print() {
        System.out.println("Image: " + url);
    }

    @Override
    public void add(Element element) {
        // Frunză în Pattern-ul Composite: nu conține sub-elemente
    }

    @Override
    public void remove(Element element) {
        // Frunză în Pattern-ul Composite: nu conține sub-elemente
    }

    @Override
    public Element get(int index) {
        return null;
    }
}