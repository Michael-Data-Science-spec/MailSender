package image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealImage rimg = new RealImage("filename.png");
        ProxyImage pimg = new ProxyImage(rimg);
        pimg.display();
    }
}
