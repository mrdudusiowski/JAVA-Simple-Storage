package storage;

/**
 *
 * @author Student
 */
public class Box {

    String name;
    int width;

    public Box(String name, int width) {
        setName(name);
        setWidth(width);
    }

    void setName(String name) {
        if (name != null && !name.equals("")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name can't be null.");
        }
    }

    void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width can't be 0 and less.");
        }
    }
    
}
