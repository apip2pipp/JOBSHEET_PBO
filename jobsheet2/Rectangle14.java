package jobsheet2;

public class Rectangle14 {
    private int length;
    private int width;

    public Rectangle14(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width : " + width);
    }

    public int getArea() {
        return length * width;
    }

    public int getCircumference() {
        return 2 * (length + width);
    }
}
