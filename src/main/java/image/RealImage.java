package image;

import lombok.Getter;

@Getter
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void display() {
        System.out.println("Displayed" + this.getClass().getName() + "from" + this.filename);
    }

    public void loadFromDisk() {
        System.out.println(this.filename + "was loaded from disk");
    }
}
