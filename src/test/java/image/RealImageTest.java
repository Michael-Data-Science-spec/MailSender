package image;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealImageTest {
    private RealImage realImage;

    @BeforeEach
    void SetUp() {
        realImage = new RealImage("img.png");
    }

    @Test
    void getFilename() {
        assertEquals("img.png", realImage.getFilename());
    }
}