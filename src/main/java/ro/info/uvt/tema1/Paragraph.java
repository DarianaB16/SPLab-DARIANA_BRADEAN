package ro.info.uvt.tema1;

public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy; // strategie opțională

    public Paragraph(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void print() {
        if (alignStrategy != null) {
            alignStrategy.render(this);
        } else {
            System.out.println("Paragraph: " + text);
        }
    }
}