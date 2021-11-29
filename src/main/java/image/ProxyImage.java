package image;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;

    public ProxyImage(RealImage realImage) {
        this.realImage = realImage;
        this.filename = realImage.getFilename();
    }

    public void display() {
        System.out.println("Displayed" + this.getClass().getName() + "from" + this.filename);
    }
}
