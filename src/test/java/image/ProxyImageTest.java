package image;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProxyImageTest {
    private RealImage realImage;
    private ProxyImage proxyImage;

    @BeforeEach
    void SetUp() {
        realImage = new RealImage("img.png");
        proxyImage = new ProxyImage(realImage);
    }


    @Test
    void display() {
        proxyImage.display();
    }
}