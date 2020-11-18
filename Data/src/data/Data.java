
package data;

import java.io.Serializable;
import javax.swing.ImageIcon;

public class Data implements Serializable {
    private String status;
    private ImageIcon image;
    private byte[] file;
    private String name;

    public Data() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ImageIcon getImage() {
        return this.image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String toString() {
        return this.name;
    }

    public byte[] getFile() {
        return this.file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }
}
